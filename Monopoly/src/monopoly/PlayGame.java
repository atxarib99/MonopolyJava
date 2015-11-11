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
            int player1 = i & 2;
            int move = players.get(player1).roll();
            System.out.println(players.get(player1).getName() + ", You rolled a " + move);
            System.out.println("You landed on " + )
        }
        
    }
    
}
