/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Arib
 */
public class ChanceCards {
    private final String[] cardNames;
    private String name;
    public ChanceCards(String name) {
        this.name = name;
        cardNames = new String[17];
        "Advance to Go", 
        "Bank error in your favor", 
        "Doctor's fees", 
        "Get out of jail free – this card may be kept until needed, or sold", 
        "Go to jail – go directly to jail – Do not pass Go, do not collect $200", 
        "It is your birthday Collect $10 from each player", 
        "Grand Opera Night – collect $50 from every player for opening night seats", 
        "Income Tax refund – collect $20", 
        "Life Insurance Matures – collect $100", 
        "Pay Hospital Fees of $100", 
        "Pay School Fees of $50", 
        "Receive $25 Consultancy Fee", 
        "You are assessed for street repairs – $40 per house, $115 per hotel", 
        "You have won second prize in a beauty contest– collect $10", 
        "You inherit $100", 
        "From sale of stock you get $50", 
        "Holiday Fund matures - Receive $100";
    }
}
