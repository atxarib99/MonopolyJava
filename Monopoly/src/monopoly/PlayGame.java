/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arib
 */
public class PlayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Player> players = new ArrayList<>();
        String[] names = new String[]{"Go",
            "Mediterranean Ave",
            "Community Chest",
            "Baltic Ave",
            "Income Tax",
            "Reading Railroad",
            "Oriental Ave",
            "Chance",
            "Vermont Ave",
            "Connecticut Ave",
            "Just Visiting / Jail",
            "St Charles Place",
            "Electric Company",
            "States Ave.",
            "Virginia Ave.",
            "Pennsylvania Railroad",
            "St. James Place",
            "Community Chest",
            "Tennessee Ave",
            "New York Ave",
            "Free Parking",
            "Kentucky Ave",
            "Chance",
            "Indiana Ave.",
            "Illinois Ave.",
            "B. & 0. Railroad",
            "Atlantic Ave.",
            "Ventnor Ave.",
            "Water Works",
            "Marvin Gardens",
            "Go to Jail",
            "Pacific Ave,",
            "North Carolina Ave.",
            "Community Chest",
            "Pennsylvania Ave.",
            "Short Loine Railroad",
            "Chance",
            "Park Place",
            "Luxury Tax",
            "Boardwalk"};
        Scanner key = new Scanner(System.in);
        players.add(new Player("Steven"));
        players.add(new Player("Arib"));
        Bank bank = new Bank();
        while (true) {
            int i = 0;
            int player1 = i & players.size();
            int move = players.get(player1).roll();
            System.out.println(players.get(player1).getName() + ", You rolled a " + move);
            players.get(player1).setID((players.get(player1).getID() + move) % 40);
            System.out.println("You landed on " + names[players.get(player1).getID()]);
            if(players.get(player1).getID() == 1)
                players.get(player1).setCash(players.get(player1).getCash() + 200);
            else if(players.get(player1).getID() == 3 || players.get(player1).getID() == 18 || players.get(player1).getID() == 34)
                
//            for(int j = 0; j < bank.properties.size(); j++) {
//                if(bank.properties.get(j).getId() == players.get(player1).getID()) {
//                    System.out.println("Would you like to buy this property? Y/N");
//                    String answer = key.next();
//                    if(answer.toUpperCase().equals("")
                }
            }
        }
        
    }
    
}
