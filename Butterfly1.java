/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Butterfly 1; emerge from cocoon
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Butterfly1 extends Thread
{
    private Console c;
    private Palette p;
    int size = 1; // used to make butterfly burst from cocoon
    
    public Butterfly1(Console con, Palette pal) {
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
	c.fillArc(x+5, y+20, 30/size, 30/size, 70, 180);
	c.fillArc(x+30, y+20, 30/size, 30/size, 290, 180);
	c.setColor(p.BUTTERFLY_WING1);
	c.fillArc(x, y, 30/size, 30/size, 150, 180);
	c.fillArc(x+35, y, 30/size, 30/size, 210, 180);
	// draws decorative star on butterfly's wing
	c.setColor(p.BUTTERFLY_STAR);
	c.fillStar(x+8, y+16, 8/size, 8/size);
	c.fillStar(x+48, y+16, 8/size, 8/size);
	// draws butterfliy's body
	c.setColor(p.BUTTERFLY_BODY);
	c.fillOval(x+28, y+10, 10/size, 10/size);
	c.fillRoundRect (x+28, y+20, 10/size, 25/size, 5, 5);
	c.drawLine (x+30, y+10, x+28, y);
	c.drawLine (x+35, y+10, x+37, y);
    }
    // erase method
    private void erase(int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x - 1, y-1, 66, 51);
    }
    
    public void halt() {
	for (int i = 0; i < 10; i++) {
	    erase(-100, -100);
	    sleep(200);
	}
    }
    // animates the butterfly to hatch from the cocoon
    public void spawn() {
	for (size = 10; size > 1; size--) {
	    draw(150, 155);
	    sleep(300);
	    erase(150, 155);
	}
	draw(150, 155);
    }
    // animates the butterfly to fly right
    public void flyRight () {
	for (int i = 0; i < 600; i += 2) {
	    draw(150 +i, 155);
	    sleep(30);
	    erase(150+i, 155);
	}
    } 
    
    public void run ()
    {
	halt ();
	spawn ();
	flyRight ();
    }
} 
