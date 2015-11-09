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
    private ArrayList<Property> properties;
    private ArrayList<SpecialCard> specialCards;
    public Player() {
        cash = 1500;
        properties = new ArrayList<Property>();
        specialCards = new ArrayList<SpecialCard>();
        
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public ArrayList<SpecialCard> getSpecialCards() {
        return specialCards;
    }

    public void setSpecialCards(ArrayList<SpecialCard> specialCards) {
        this.specialCards = specialCards;
    }
    public void addProperty(Property prop) {
        properties.add(prop);
    }
    public void addSpecialCard(SpecialCard sc) {
        specialCards.add(sc);
    }
    
}
