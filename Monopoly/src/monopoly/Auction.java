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
public class Auction {
    ArrayList<Player> bidding;
    int highestBid;
    int turn;
    public Auction(ArrayList<Player> given, Property prop) {
        highestBid = prop.getPrice();
        bidding = given;
    }
    public void bid() {
        System.out.println("Player" + turn % bidding.size() + "enter your bid");
    }
}
