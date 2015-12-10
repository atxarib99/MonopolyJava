/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Arib
 */
public class ChanceCards {
	/* Lists that hold the names and IDs of each type of chance card */
    private final String[] names = {
        "Advance to Go (Collect $200) ",
        "Advance to Illinois Ave.",
        "Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown. ",
        "Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.",
        "Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.",
        "Advance to St. Charles Place – if you pass Go, collect $200",
        "Bank pays you dividend of $50 ",
        "Get out of Jail free – this card may be kept until needed, or traded/sold ",
        "Go back 3 spaces ",
        "Go directly to Jail – do not pass Go, do not collect $200 ",
        "Make general repairs on all your property – for each house pay $25 – for each hotel $100 ",
        "Pay poor tax of $15",
        "Take a trip to Reading Railroad – if you pass Go collect $200 ",
        "Take a walk on the Boardwalk – advance token to Boardwalk ",
        "You have been elected chairman of the board – pay each player $50 ",
        "Your building loan matures – collect $150 ",
        "You have won a crossword competition - collect $100"
    };
    private final int[] ids = new int[names.length];
    public ChanceCards() {
        for (int i = 1; i < ids.length + 1; i++) {
            ids[i - 1] = i;
        }
    }
	
	/* Switch case that gives each chance card type a specific function */
    public void doAction(Player player, int id, Board board, Data data) {
        switch(id) {
            case 1: player.setID(0);
            player.setCash(player.getCash() + 200); break;
            case 2: player.setID(25); break;
            case 3: player.setID(nextUtil(player)); 
//            if(board.bank.properties.contains(board.properties.get(player.getID())))
            //implement asking to buy
                break;
            case 4: player.setID(nextRailroad(player)); break;
            case 5: player.setID(nextRailroad(player)); break;
            case 6: player.setID(12); break;
            case 7: player.setCash(player.getCash() + 50); break;
            case 8: player.jailCard = true; break;
            case 9: player.setID(player.getID() - 3); break;
            case 10: player.setID(11); break;
            case 11: getRepairs(player, board); break;
            case 12: player.setCash(player.getCash() - 15); break;
            case 13: player.setID(6); break;
            case 14: player.setID(40); break;
            case 15: player.setCash(player.getCash() - (data.players.size() * 50)); break;
            case 16: player.setCash(player.getCash() + 150); break;
            case 17: player.setCash(player.getCash() + 100); break;
            
        }
    }
	
	/* method that returns the next possible utility to land on for the chance
	 * card that tells the player to go to the next utility
	*/
    private int nextUtil(Player player) {
        int temp = player.getID();
        if (temp < 20)
            return 13;
        return 29;
    }
	
	/* method that returns the next possible railroad to go to for the card that
	 * tells the player to go to the next railroad
	*/
    private int nextRailroad(Player player) {
        int temp = player.getID();
        if(temp < 6 || temp > 36)
            return 6;
        if(temp < 16)
            return 16;
        if(temp < 26)
            return 26;
        if(temp < 36)
            return 36;
        return -1;
    }
	
	/* method that does the same thing as the getRepairs in CommunityCards.
	 * A specific card requires the player to "repair" each house and hotel
     * they own; this method gets the amount they need to pay for the repairs
	*/
    public int getRepairs(Player player, Board board) {
        int house = 0;
        int hotel = 0;
        int size = player.getProperties().size();
        int returnable;
        for(int i = 0; i < size; i++) {
            house += player.getProperties().get(i).getHouses();
            hotel += player.getProperties().get(i).getHotel();
        }
        returnable = house + hotel;
        return returnable;
    }
}
