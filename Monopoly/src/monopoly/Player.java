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
//Defines a player
public class Player {
    private int cash;
    private int id;
    private ArrayList<Property> properties;
    String name;
    //private ArrayList<SpecialCard> specialCards;
    public Player(String name) {
        this.name = name;
        id = 1;
        cash = 1500;
        properties = new ArrayList<>();
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
    //removes a property
    public void removeProperty(Property prop) {
        properties.remove(prop);
    }
//    public void addSpecialCard(SpecialCard sc) {
//        specialCards.add(sc);
//    }
    
}
