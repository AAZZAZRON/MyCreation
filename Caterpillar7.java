/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Caterpillar 7; caterpillar climbs tree
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Caterpillar7 extends Thread
{
    private Console c;
    private Palette p;
    
    public Caterpillar7 (Console con, Palette pal) {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    private void draw(int x, int y) {
	// fillStar, fillOval, fillRect, fillRoundRect
	// draws the caterpillar's legs (feet they use to crawl)
	c.setColor(p.CATERPILLAR_LEG); 
	c.fillStar(x-5, y+18, 25, 25);
	c.fillStar(x-5, y+22, 25, 25);
	c.fillStar(x-5, y+42, 25, 25);
	c.fillStar(x-5, y+46, 25, 25);
	// draws the caterpillar's head and ends
	c.setColor(p.CATERPILLAR_1);
	c.fillOval(x, y+5, 20, 30);
	c.fillOval(x, y+55, 20, 30);
	// draws the caterpillar's body
	c.setColor(p.CATERPILLAR_2);
	c.fillRect(x, y+20, 20, 50);
	// draws decorative aspects
	c.setColor(p.CATERPILLAR_3);
	c.fillOval(x, y+25, 20, 15);
	c.fillOval(x, y+50, 20, 15);
	// draws caterpillar's eye
	c.setColor(p.CATERPILLAR_EYE); 
	c.fillRoundRect(x + 10, y + 10, 5, 5, 5, 5);
	// draws hair on back
	c.setColor(p.CATERPILLAR_HAIR); 
	c.fillRect(x + 20, y+20, 5, 50);
    } 
    
    // erase method
    private void erase(int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x-5, y + 5, 30, 81);
    }  
    
    // animates the caterpillar to climb a tree
    public void climb() {
	for (int i = 0; i < 150; i += 2) {
	    draw(70, 305 - i);
	    sleep(40);
	    erase(70, 305 - i);
	}
    }
    
    // pause between the caterpillar climbing a tree and turning into a cocoon
    public void morph() {
	draw(70, 155);
	sleep(1000);
	erase(70, 155);
    }
    
    // draws a cocoon onto the screen
    private void drawCocoon() {
	c.setColor(p.COCOON1);
	int[] x = {150, 150, 140, 150, 160, 152, 152};
	int[] y = {140, 162, 182, 212, 182, 162, 140};
	c.fillPolygon (x, y, x.length);
	c.setColor(p.COCOON2);
	c.drawLine(150, 140, 152, 172);
	c.drawLine(140, 180, 155, 170);
	c.drawLine(141, 185, 156, 175);
	c.drawLine(141, 185, 155, 195);
	c.drawLine(147, 200, 156, 195);
    }
	
    public void run ()
    {
	climb();
	morph();
	drawCocoon();
    }
}
	
