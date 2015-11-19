/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

import java.util.ArrayList;

/**
 *
 * @author lo_856348
 */
public class Info {
    private ArrayList<Player> players;
    private Bank bank;
    
    public Info(ArrayList<Player> p, Bank b) {
        players = p;
        bank = b;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Bank getBank() {
        return bank;
    }
    
}
