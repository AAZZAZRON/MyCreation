/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Caterpillar 6; caterpillar moves left towards tree
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Caterpillar6 extends Thread
{
    private Console c;
    private Palette p;
    
    public Caterpillar6(Console con, Palette pal) {
	c = con;
	p = pal;
    }

    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }


    private void draw(int x, int y) {
	// fillStar, fillArc, fillRect, fillOval, fillRoundRect
	// draws the caterpillar's legs (feet they use to crawl)
	c.setColor(p.CATERPILLAR_LEG);    
	c.fillStar(x + 22, y, 25, 25);
	c.fillStar(x + 43, y, 25, 25);
	// draws the caterpillar's head 
	c.setColor(p.CATERPILLAR_1); 
	c.fillArc(x + 5, y, 30, 20, 90, 180);
	// draws the caterpillar's body
	c.setColor(p.CATERPILLAR_2); 
	c.fillRect(x + 20, y, 55, 20);
	 // draws the hair on the caterpillar's back
	c.setColor(p.CATERPILLAR_HAIR); 
	c.fillRect(x + 20, y-5, 50, 5);
	// draws the caterpillar's end
	c.setColor(p.CATERPILLAR_1); 
	c.fillArc(x -15 + 70, y, 30, 20, 270, 180);
	// draws the caterpillar's eye
	c.setColor(p.CATERPILLAR_EYE); 
	c.fillRoundRect(x + 10, y + 5, 5, 5, 5, 5);
	// draws decorative aspects on the caterpillar's body
	c.setColor(p.CATERPILLAR_3);
	c.fillOval(x + 27, y, 15, 20);
	c.fillOval(x + 47, y, 15, 20);
	
    }
    
    // erase method
    private void erase(int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x + 5, y-5, 81, 30);
    }
    
    // animates the caterpillar to move left
    public void moveLeft() {
	for (int i = 0; i < 110; i += 2) {
	    draw(180-i, 400);
	    sleep(40);
	    erase(180-i, 400);
	}
    }
    
    // used to repaint part of an object in the background obstructed by the caterpillar
    public void redrawTree() {
	c.setColor(p.TREE_BROWN);
	int[] tx = {0, 150, 100, 80, 75};
	int[] ty = {425, 425, 405, 370, 320};
	c.fillPolygon(tx, ty, tx.length);
    }


    public void run ()
    {
	sleep(500);
	moveLeft ();
	redrawTree();
    }
}



