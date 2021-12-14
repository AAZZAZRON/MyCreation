/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Caterpillar 1; caterpillar walks right
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Caterpillar1 extends Thread
{
    private Console c;
    private Palette p;
    
    public Caterpillar1(Console con, Palette pal) {
	c = con;
	p = pal;
    }

    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }

    // draws the caterpillar with a contracted body to simulate crawling
    private void draw(int x, int y) { 
	// fillStar, fillArc, fillOval, fillRect, fillRoundRect
	c.setColor(p.CATERPILLAR_LEG);    
	c.fillStar(x + 22, y, 25, 25);
	c.fillStar(x + 43, y, 25, 25);
	c.setColor(p.CATERPILLAR_1); 
	c.fillArc(x + 5, y, 30, 20, 90, 180);
	c.setColor(p.CATERPILLAR_2); 
	c.fillRect(x + 20, y, 55, 20);
	c.setColor(p.CATERPILLAR_HAIR); 
	c.fillRect(x + 20, y-5, 50, 5);
	c.setColor(p.CATERPILLAR_1); 
	c.fillArc(x -15 + 70, y, 30, 20, 270, 180);
	c.setColor(p.CATERPILLAR_EYE); 
	c.fillRoundRect(x - 15 + 88, y + 5, 5, 5, 5, 5);
	c.setColor(p.CATERPILLAR_3);
	c.fillOval(x + 27, y, 15, 20);
	c.fillOval(x + 47, y, 15, 20);
	
    } 
    
    // draws the caterpillar with an extended body to simulate crawling
    private void draw(int x, int y, boolean yesNo) {
	c.setColor(p.CATERPILLAR_LEG);    
	c.fillStar(x + 15, y, 25, 25);
	c.fillStar(x + 57, y, 25, 25);
	c.setColor(p.CATERPILLAR_1); 
	c.fillArc(x, y, 30, 20, 90, 180);
	c.setColor(p.CATERPILLAR_2); 
	c.fillRect(x + 15, y, 70, 20);
	c.setColor(p.CATERPILLAR_HAIR); 
	c.fillRect(x + 15, y-5, 70, 5);
	c.setColor(p.CATERPILLAR_1); 
	c.fillArc(x + 70, y, 30, 20, 270, 180);
	c.setColor(p.CATERPILLAR_EYE); 
	c.fillRoundRect(x + 88, y + 5, 5, 5, 5, 5);
	c.setColor(p.CATERPILLAR_3);
	c.fillOval(x + 22, y, 20, 20);
	c.fillOval(x + 57, y, 20, 20);
    } 
    
    // erase method for contracted caterpillar
    private void erase(int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x + 5, y - 5, 80, 30);
    }
    
     // erase method for extended caterpillar
    private void erase(int x, int y, boolean yN) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x, y - 5, 100, 30);
    }
    
    // animates the caterpillar
    public void moveRight() {
	for (int i = 150; i < 400; i += 10) {
	    draw(i, 400);
	    sleep(180);
	    erase(i, 400);
	    draw(i, 400, true);
	    sleep(180);
	    erase(i, 400, true);
	}
	draw(400, 400);
    }


    public void run ()
    {
	moveRight ();
    }
}



