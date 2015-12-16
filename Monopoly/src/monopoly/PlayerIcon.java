/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**
 *
 * @author Steven
 */
public class PlayerIcon extends JPanel {
	int[] indexes = new int[4];
	Image car = null;
	Image boot = null;
	Image dog = null;
	Image hat = null;
	Image base = null;
	
	PlayerIcon() {
		try {
		car = ImageIO.read(new File("Monopoly_Car.jpg"));
		} catch (IOException e) {
		}
		try {
		boot = ImageIO.read(new File("Monopoly_Boot.jpg"));
		} catch (IOException e) {
		}
		try {
		dog = ImageIO.read(new File("Monopoly_Dog.jpg"));
		} catch (IOException e) {
		}
		try {
		hat = ImageIO.read(new File("Monopoly_Hat.jpg"));
		} catch (IOException e) {
		}
		try {
			base = ImageIO.read(new File("MonopolyBoard.jpg"));
		} catch (IOException e) {
		}
        repaint();
	}
	
	public void updatePlayers(int[] spots) {
        this.indexes = spots;
        repaint();
    }
	
	@Override
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
//        graphics.drawImage(car, null, 716, 736);
//		graphics.drawImage(boot, null, 776, 736);
//		graphics.drawImage(dog, null, 716, 790);
//		graphics.drawImage(hat, null, 776, 790);
		graphics.drawImage(base, 0, 0, this);
    }
}