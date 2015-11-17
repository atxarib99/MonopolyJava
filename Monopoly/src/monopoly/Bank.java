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
    public ArrayList<Property> properties;
    //sets the tax money pool and all the properties at the start of the game
    public Bank() {
         taxPool = 0;
         properties = new ArrayList<>();
         
         //String n, Color c, p, m, r0, r1, r2, r3, r4, h, i, hs, boolean hts, boolean ism
         properties.add(new Property(1, "Go", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, false, false));
         properties.add(new Property(5, "Mediterranean Ave", Color.magenta, 60, 30, 2, 10, 30, 90, 160, 250, 50, 2, 0, false, false));
         properties.add(new Property(9, "Community Chest1", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, false, false));
         properties.add(new Property(5, "Baltic Ave", Color.magenta, 60, 30, 4, 20, 60, 180, 320, 450, 50, 4, 0, false, false));
         properties.add(new Property(8, "Income Tax", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, -1, false, false));
         properties.add(new Property(6, "Reading Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 0, 6, -1, false, false));
         properties.add(new Property(5, "Oriental Ave", Color.cyan, 100, 50, 6, 30, 90, 270, 400, 550, 50, 7, 0, false, false));
         properties.add(new Property(9, "Chance1", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, -1, false, false));
         properties.add(new Property(5, "Vermont Ave", Color.cyan, 100, 50, 6, 30, 90, 270, 400, 550, 50, 9, 0, false, false));
         properties.add(new Property(5, "Connecticut Ave", Color.cyan, 120, 60, 8, 40, 100, 300, 450, 600, 50, 10, 0, false, false));
         properties.add(new Property(2, "Jail", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, -1, false, false));
         properties.add(new Property(5, "St. Charles Place", Color.pink, 140, 70, 10, 50, 150, 450, 625, 750, 100, 12, 0, false, false));
         properties.add(new Property(7, "Electric Company", Color.white, 150, 75, 4, 10, 0, 0, 0, 0, 0, 13, -1, false, false));
         properties.add(new Property(5, "States Ave", Color.pink, 140, 70, 10, 50, 150, 450, 625, 750, 100, 14, 0, false, false));
         properties.add(new Property(5, "Virginia Ave", Color.pink, 160, 80, 12, 60, 180, 500, 700, 900, 100, 15, 0, false, false));
         properties.add(new Property(6, "Pennsylvania Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 0, 16, -1, false, false));
         properties.add(new Property(5, "St. James Place", Color.orange, 180, 90, 14, 70, 200, 550, 750, 950, 100, 17, 0, false, false));
         properties.add(new Property(9, "Community Chest2", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, -1, false, false));
         properties.add(new Property(5, "Tennessee Ave", Color.orange, 180, 90, 14, 70, 200, 550, 750, 950, 100, 19, 0, false, false));
         properties.add(new Property(5, "New York Ave", Color.orange, 200, 100, 16, 80, 220, 600, 800, 1000, 100, 20, 0, false, false));
         properties.add(new Property(3, "Free Parking", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, -1, false, false));
         properties.add(new Property(5, "Kentucky Ave", Color.red, 220, 110, 18, 90, 250, 700, 875, 1050, 150, 22, 0, false, false));
         properties.add(new Property(9, "Chance2", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 23, -1, 0, false, false));
         properties.add(new Property(5, "Indiana Ave", Color.red, 220, 110, 18, 90, 250, 700, 875, 1050, 150, 24, 0, false, false));
         properties.add(new Property(5, "Illinois Ave", Color.red, 240, 120, 20, 100, 300, 750, 925, 1100, 150, 25, 0, false, false));
         properties.add(new Property(6, "B. & O. Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 0, 26, -1, false, false));
         properties.add(new Property(5, "Atlantic Ave", Color.yellow, 260, 130, 22, 110, 330, 800, 975, 1150, 150, 27, 0, false, false));
         properties.add(new Property(5, "Ventnor Ave", Color.yellow, 260, 130, 22, 110, 330, 800, 975, 1150, 150, 28, 0, false, false));
         properties.add(new Property(7, "Water Works", Color.white, 150, 75, 4, 10, 0, 0, 0, 0, 0, 0, -1, false, false));
         properties.add(new Property(5, "Marvin Gardens", Color.yellow, 280, 140, 24, 120, 360, 850, 1025, 1200, 150, 30, 0, false, false));
         properties.add(new Property(4, "Go to Jail", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 31, -1, false, false));
         properties.add(new Property(5, "Pacific Ave", Color.green, 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 32, 0, false, false));
         properties.add(new Property(5, "North Carolina Ave", Color.green, 300, 150, 26, 130, 390, 900, 1100, 1275, 200, 33, 0, false, false));
         properties.add(new Property(9, "Community Chest3", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 34, -1, false, false));
         properties.add(new Property(5, "Pennsylvania Ave", Color.green, 320, 160, 28, 150, 450, 1000, 1200, 1400, 200, 35, 0, false, false));
         properties.add(new Property(6, "Short Line Railroad", Color.white, 200, 100, 0, 25, 50, 100, 200, 0, 0, 36, -1, false, false));
         properties.add(new Property(9, "Chance3", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 37, -1, false, false));
         properties.add(new Property(5, "Park Place", Color.blue, 350, 175, 35, 175, 500, 1100, 1300, 1500, 200, 38, 0, false, false));
         properties.add(new Property(8, "Luxury Tax", Color.white, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39, -1, false, false));
         properties.add(new Property(5, "Boardwalk", Color.blue, 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, 40, 0, false, false));

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