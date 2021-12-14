/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Butterfly 2; meet hummingbird
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Butterfly2 extends Thread
{
    private Console c;
    private Palette p;
    
    public Butterfly2(Console con, Palette pal) {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    private void draw (int x, int y) {
	// fillArc, fillStar, fillOval, fillRoundRect, drawLine
	// Draws butterfly's wings
	c.setColor(p.BUTTERFLY_WING2);
	c.fillArc(x+5, y+20, 30, 30, 70, 180);
	c.fillArc(x+30, y+20, 30, 30, 290, 180);
	c.setColor(p.BUTTERFLY_WING1);
	c.fillArc(x, y, 30, 30, 150, 180);
	c.fillArc(x+35, y, 30, 30, 210, 180);
	// draws decorative star on butterfly's wing
	c.setColor(p.BUTTERFLY_STAR);
	c.fillStar(x+8, y+16, 8, 8);
	c.fillStar(x+48, y+16, 8, 8);
	// draws butterfliy's body
	c.setColor(p.BUTTERFLY_BODY);
	c.fillOval(x+28, y+10, 10, 10);
	c.fillRoundRect (x+28, y+20, 10, 25, 5, 5);
	c.drawLine (x+30, y+10, x+28, y);
	c.drawLine (x+35, y+10, x+37, y);
    }
    // erase method
    private void erase(int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x - 1, y-1, 66, 51);
    }
    // animates the butterfly to fly right
    public void flyRight () {
	for (int i = -100; i < 270; i += 2) {
	    draw(i, 140);
	    sleep(30);
	    erase(i, 140);
	}
	draw(270, 140);
    } 
    // animates the butterfly to fly out of the scope of the scene
    public void flyOut () {
	for (int i = 270; i < 690; i += 2) {
	    draw(i, 140);
	    sleep(30);
	    erase(i, 140);
	}
    } 
    
    public void run ()
    {
	sleep(5000);
	flyRight ();
	sleep(2000);
	flyOut ();
    }
} 
