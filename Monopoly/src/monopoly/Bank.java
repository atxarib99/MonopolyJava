/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

import java.awt.Color;
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
         
         //String n, Color c, p, m, r0, r1, r2, r3, r4, h, i, hs, boolean hts, boolean ism
         properties.add(new Property(1, "Go", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property(5, "Mediterranean Ave", Color.magenta, 60, 30, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(9, "Community Chest1", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property(5, "Baltic Ave", Color.magenta, 60, 30, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(8, "Income Tax", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property(6, "Reading Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 2, -1, false, false));
         properties.add(new Property("Oriental Ave", Color.cyan, 100, 50, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Chance1", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Vermont Ave", Color.cyan, 100, 50, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Connecticut Ave", Color.cyan, 120, 60, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Jail", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("St. Charles Place", Color.pink, 140, 70, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(7, "Electric Company", Color.white, 150, 75, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("States Ave", Color.pink, 140, 70, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Virginia Ave", Color.pink, 160, 80, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(6, "Pennsylvania Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 2, -1, false, false));
         properties.add(new Property("St. James Place", Color.orange, 180, 90, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Community Chest2", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Tennessee Ave", Color.orange, 180, 90, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("New York Ave", Color.orange, 200, 100, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Free Parking", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Kentucky Ave", Color.red, 220, 110, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Chance2", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Indiana Ave", Color.red, 220, 110, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Illinois Ave", Color.red, 240, 120, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(6, "B. & O. Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 2, -1, false, false));
         properties.add(new Property("Atlantic Ave", Color.yellow, 260, 130, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Ventnor Ave", Color.yellow, 260, 130, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(7, "Water Works", Color.white, 150, 75, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Marvin Gardens", Color.yellow, 280, 140, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Go to Jail", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Pacific Ave", Color.green, 300, 150, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("North Carolina Ave", Color.green, 300, 150, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property("Community Chest3", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Pennsylvania Ave", Color.green, 320, 160, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(6, "Short Line Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 2, -1, false, false));
         properties.add(new Property("Chance3", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Park Place", Color.blue, 350, 175, 2, 10, 30, 90, 160, 250, 2, 0, false, false));
         properties.add(new Property(8, "Luxury Tax", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false));
         properties.add(new Property("Boardwalk", Color.blue, 400, 200, 2, 10, 30, 90, 160, 250, 2, 0, false, false));

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

    //removes a property from the list in the bank and returns it to the player
    //who bought it to put in their list of properties
    public Property takeProperty(int index) {
        Property property = properties.get(index);
        properties.remove(index);
        return property;
    }
}