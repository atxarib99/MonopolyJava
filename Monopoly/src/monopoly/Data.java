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
    Bank bank;
    ArrayList<Player> players;
    public Data() {
        bank = new Bank();
    }
    public Player getPlayerFromString(String str) {
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).getName().equals(str)) {
                return players.get(i);
            }
        }
        return null;
    }
}
