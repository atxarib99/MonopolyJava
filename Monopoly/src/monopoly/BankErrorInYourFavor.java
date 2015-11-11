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
public class BankErrorInYourFavor extends CommunityCards 
{
    String name;
    public BankErrorInYourFavor(String name) {
        super(name);
    }
    public void doAction(Player play) {
        play.setCash(play.getCash() + 75);
        
    }
    
}
