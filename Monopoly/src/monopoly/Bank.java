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
public class Bank {
    private int taxPool;
    private ArrayList<Property> properties;
    
    //sets the tax money pool and all the properties at the start of the game
    public Bank() {
         taxPool = 0;
         properties = new ArrayList<>();
    }

    //returns the amount of money gathered in the tax pool
    public int getTaxPool() {
        return taxPool;
    }
    
    //gets a property from the list of properties still owned by the bank
    public Property getProperty(int index) {
        return properties.get(index);
    }
    
    //changes the amount of money in the tax pool
    public void setTaxPool(int taxPool) {
        this.taxPool = taxPool;
    }

    //
    public void takeProperty(int index) {
        properties.remove(index);
    }
}