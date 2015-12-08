/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

import java.awt.Color;

/**
 *
 * @author lo_856348
 */
public class Property {
    //variables for the characteristics of the properties
    private int     type;
    private int     rent0;
    private int     rent1;
    private int     rent2;
    private int     rent3;
    private int     rent4;
    private int     hotel;
    private int     housePrice;
    private int     id;
    private int     houses;
    private boolean hotels;
    private boolean isMorgaged;    
    private String  name;
    private Color   color;
    private int     price;
    private int     morgage;
        //1 : go
        //2 : jail
        //3 : free parking
        //4 : go to jail
        //5 : property
        //6 : railroad
        //7 : utility
        //8 : tax
        //9 : special cards
    public void setHouses(int houses) {
        this.houses = houses;
    }

    public void setHotels(boolean hotels) {
        this.hotels = hotels;
    }


    public void setIsMorgaged(boolean isMorgaged) {
        this.isMorgaged = isMorgaged;
    }
        


    public int getType() {
        return type;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public boolean isHotels() {
        return hotels;
    }

    public boolean isIsMorgaged() {
        return isMorgaged;
    }

    
    /* main constructor that holds all of the characteristics of the properties
     * includes the type of property, name, color, prices of all possible
     * situations when one lands on the property, and the number of houses or
     * if there is a hotel or if it's morgaged
     */
    public Property(int t, String n, Color c, int p, int m, int r0, int r1, int r2, int r3, int r4, int h, int hp, int i, int hs, boolean hts, boolean ism) {
        type = t;
        name = n;
        color = c;
        price = p;
        morgage = m;
        rent0 = r0;
        rent1 = r1;
        rent2 = r2;
        rent3 = r3;
        rent4 = r4;
        hotel = h;
        housePrice = hp;
        id = i;
        houses = hs;
        hotels = hts;
        isMorgaged = ism;
    }
    
    /* methods used to return any characteristic of the property */
    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getMorgage() {
        return morgage;
    }
    
    public int getRent0() {
        return rent0;
    }

    public int getRent1() {
        return rent1;
    }

    public int getRent2() {
        return rent2;
    }

    public int getRent3() {
        return rent3;
    }

    public int getRent4() {
        return rent4;
    }

    public int getHotel() {
        return hotel;
    }
    
    public int getId() {
        return id;
    }

    public int getHouses() {
        return houses;
    }

    public boolean isMorgaged() {
        return isMorgaged;
    }
}
