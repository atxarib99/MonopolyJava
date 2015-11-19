/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Arib
 */
//Defines a player
public class Player {
    private int cash;
    private int id;
    private ArrayList<Property> properties;
    String name;
    boolean jailCard;
    //private ArrayList<SpecialCard> specialCards;
    public Player(String name) {
        this.name = name;
        id = 1;
        cash = 1500;
        properties = new ArrayList<>();
        jailCard = false;
    //    specialCards = new ArrayList<SpecialCard>();
        
    }
    //gets the Cash
    public int getCash() {
        return cash;
    }
    //sets the Cash
    public void setCash(int cash) {
        this.cash = cash;
    }
    //returns the properties
    public ArrayList<Property> getProperties() {
        return properties;
    }
    //sets the properties
    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
    //gets the id
    public int getID() {
        return id;
    }
    //sets the id
    public void setID(int i) {
        id = i;
    }
    public int roll() {
        Random rand = new Random();
        int dice1 = rand.nextInt((6 - 1) + 1);
        int dice2 = rand.nextInt((6 - 1) + 1);
        int movement = dice1 + dice2;
        if(dice1 == dice2) {
            dice1 = rand.nextInt((6 - 1) + 1);
            dice2 = rand.nextInt((6 - 1) + 1);
            movement += (dice1 + dice2);
        }
        return movement;
        
    }
//    public ArrayList<SpecialCard> getSpecialCards() {
//        return specialCards;
//    }
//
//    public void setSpecialCards(ArrayList<SpecialCard> specialCards) {
//        this.specialCards = specialCards;
//    }
    //adds a property
    public void addProperty(Property prop) {
        properties.add(prop);
    }
    public String getName() {
        return name;
    }
    //removes a property
    public void removeProperty(Property prop) {
        properties.remove(prop);
    }
//    public void addSpecialCard(SpecialCard sc) {
//        specialCards.add(sc);
//    }
    
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
    
}
