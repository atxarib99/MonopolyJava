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
    ArrayList<Player> players;
    private Bank bank;
    public Data() {
        players = new ArrayList<Player>();
        bank = new Bank();
    }
}
