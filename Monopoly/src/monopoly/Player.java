/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Arib
 */
//Defines a player
public class Player {
	
	/* characteristics of a player include:
	 * current cash owned, current space or id the player is on, an ArrayList of
	 * properties owned, the player's name, and if they have a get out of jail
	 * free card
	*/
    private int cash;
    private int id;
    ArrayList<Property> properties;
    String name;
    boolean jailCard;
    boolean inJail;
    int jailCount;
    Property error = new Property(0, "Error", Color.RED, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    //private ArrayList<SpecialCard> specialCards;
	
	/* loads all the default characteristics into the player */
    public Player(String name) {
        this.name = name;
        id = 1;
        cash = 1500;
        properties = new ArrayList<>();
        jailCard = false;
        inJail = false;
        jailCount = 0;
    //    specialCards = new ArrayList<SpecialCard>();
        
    }
	
    /* gets the Cash */
    public int getCash() {
        return cash;
    }
	
    /* sets the Cash */
    public void setCash(int cash) {
        this.cash = cash;
    }
	
    /* returns the properties */
    public ArrayList<Property> getProperties() {
        return properties;
    }
	
    /* sets the properties */
    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
	
    /* gets the id */
    public int getID() {
        return id;
    }
	
    /* sets the id */
    public void setID(int i) {
        id = i % 40;
    }
	
	/* When it is the player's turn and they press the roll button, a random
	 * roll is generated and the player moves the total spaces of both dice.
	*  If the player rolls doubles (when both dice are the same), the player
	 * gets to go again
	*/
    public ArrayList<Integer> roll() {
        Random rand = new Random();
        int dice1 = rand.nextInt((6 - 1) + 1) + 1;
        int dice2 = rand.nextInt((6 - 1) + 1) + 1;
        ArrayList<Integer> returnable = new ArrayList<>();
        int movement = dice1 + dice2;
        if(dice1 == dice2) {
            dice1 = rand.nextInt((6 - 1) + 1);
            dice2 = rand.nextInt((6 - 1) + 1);
            movement += (dice1 + dice2);
        }
        returnable.add(movement);
        returnable.add(dice1);
        returnable.add(dice2);
        return returnable;
        
    }

    /*adds a property to the player's list of properties */
    public void addProperty(Property prop) {
        properties.add(prop);
    }
	
	/* returns the player's name */
    public String getName() {
        return name;
    }
	
	/* if player owns the property requested, return the property */
    public Property getPropertyFromString(String str) {
        for(int i = 0; i < properties.size(); i++) {
            if(properties.get(i).getName().equals(str)) {
                return properties.get(i);
            }
        }
        return error;
    }
    
    /*removes a property */
    public void removeProperty(Property prop) {
        properties.remove(prop);
    }
	
	/* When someone requests a trade, the person receiving the trade has the
	 * option to accept or decline the trade.
	 */
    public boolean acceptTrade(String prop1, String prop2, int cash1, int cash2) {
        //TODO: implement
		return false;
    }
	
	//NOT USED
	/*
    public int bid(int highestBid) {
        System.out.println("DO you want to bid?");
        int returnable;
        if (System.in.toString().equals("N")) {
            return -1;
        }
        else {
            String input = System.in.toString();
            try {
                returnable = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Couldnt parse int, try again");
                input = System.in.toString();
                try {
                    returnable = Integer.parseInt(input);
                } catch(NumberFormatException e2) {
                    return -1;
                }
            }
            
        }
        return returnable;
            
    }
	*/
    
}
