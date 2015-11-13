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
public class CommunityCards {
    private String name;
    private final String[] names = {
        "Advance to Go (Collect $200)", 
        "Bank error in your favor – collect $75", 
        "Doctor's fees – Pay $50", 
        "Get out of jail free – this card may be kept until needed, or sold", 
        "Go to jail – go directly to jail – Do not pass Go, do not collect $200", 
        "It is your birthday Collect $10 from each player" ,
        "Grand Opera Night – collect $50 from every player for opening night seats", 
        "Income Tax refund – collect $20", 
        "Life Insurance Matures – collect $100", 
        "Pay Hospital Fees of $100", 
        "Pay School Fees of $50", 
        "Receive $25 Consultancy Fee", 
        "You are assessed for street repairs – $40 per house, $115 per hotel", 
        "You have won second prize in a beauty contest– collect $10", 
        "You inherit $100", 
        "From sale of stock you get $50", 
        "Holiday Fund matures - Receive $100",
    };
    private final int[] ids = new int[names.length];
    public CommunityCards(String name) {
        this.name = name;
        for (int i = 1; i < ids.length + 1; i++) {
            ids[i - 1] = i;
        }
    }
    public void doAction(Player player, int id) {
        switch(id) {
            case 1: player.setID(0);
            player.setCash(player.getCash() + 200); break;
            case 2: player.setCash(player.getCash() + 75); break;
            case 3: player.setCash(player.getCash() - 1); break;
            case 4: player.jailCard = true;break;
            case 5: ;break;
            case 6: ;break;
            case 7: ;break;
            case 8: ;break;
            case 9: ;break;
            case 10: ;break;
            case 11: ;break;
            case 12: ;break;
            case 13: ;break;
            case 14: ;break;
            case 15: ;break;
            case 16: ;break;
            case 17: ;break;
            
    }

}
