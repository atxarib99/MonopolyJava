/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;

/**
 *
 * @author Arib
 */
public class Data {
    /* This class holds all the necessary information for when the player wants
	 * to save the game: the properties left in the bank, and the information
	 * of all the players.
	 */
	Bank bank;
    ArrayList<Player> players;
    Player error = new Player("Error");
    public Data() {
        bank = new Bank();
    }
	
	/* returns the player with the name requested */
    public Player getPlayerFromString(String str) {
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).getName().equals(str)) {
                return players.get(i);
            }
        }
        return error;
    }
}
