/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Hummingbird 1; hummingbird meets butterfly
	and flies off with it
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Hummingbird1 implements Runnable
{
    private Console c;
    private Palette p;
    
    public Hummingbird1 (Console con, Palette pal) {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    private void drawL (int x, int y) {
	// fillRoundRect, fillRect, fillPolygon, fillOval, fillArc
	// draws the hummingbird facing left
	// draws the beak
	c.setColor (p.GOOSE_BEAK1);
	c.fillRoundRect (x-26, y+10, 30, 5, 5, 5);
	c.fillRect (x+30, y+30, 5, 17);
	c.fillRect (x+40, y+30, 5, 17);
	// draws the body
	c.setColor(p.HUMMINGBIRD_BODY);
	int[] hx = {x+10, x+80, x+40, x+30};
	int[] hy = {y+10, y+25, y+40, y+38};
	c.fillPolygon (hx, hy, hx.length);
	// draws the head
	c.setColor(p.HUMMINGBIRD_HEAD);
	c.fillOval(x, y, 25, 25);
	// draws the wing
	c.setColor(p.HUMMINGBIRD_WING);
	c.fillArc (x+19, y-15, 40, 40, 210, 180);
	// draws the tail
	int[] tx = {x+70, x+95, x+85, x+95, x+70};
	int[] ty = {y+25, y+15, y+25, y+35, y+28};
	c.fillPolygon (tx, ty, tx.length);
	// draws the eye
	c.setColor (Color.white);
	c.fillRoundRect (x+8, y+8, 5, 5, 5, 5);
    }
    
    private void drawR (int x, int y) {
	// fillRoundRect, fillRect, fillOval, fillPolygon, fillArc
	// draws the hummingbird facing right
	c.setColor (p.GOOSE_BEAK1);
	c.fillRoundRect (x, y+10, 30, 5, 5, 5);
	c.fillRect (x-30, y+30, 5, 17);
	c.fillRect (x-40, y+30, 5, 17);
	c.setColor(p.HUMMINGBIRD_BODY);
	int[] hx = {x-10, x-80, x-40, x-30};
	int[] hy = {y+10, y+25, y+40, y+38};
	c.fillPolygon (hx, hy, hx.length);
	c.setColor(p.HUMMINGBIRD_HEAD);
	c.fillOval(x-20, y, 25, 25);
	c.setColor(p.HUMMINGBIRD_WING);
	c.fillArc (x-52, y-15, 40, 40, 150, 180);
	int[] tx = {x-70, x-95, x-85, x-95, x-70};
	int[] ty = {y+25, y+15, y+25, y+35, y+28};
	c.fillPolygon (tx, ty, tx.length);
	c.setColor (Color.white);
	c.fillRoundRect (x-8, y+8, 5, 5, 5, 5);
    }
    
    // erase method for left facing bird
    private void eraseL (int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x - 26, y-5, 121, 52);
    }
    
    // erase method for right facing bird
    private void eraseR (int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x-95, y-5, 125, 52);
    }
    
    // animates bird to fly left
    public void flyLeft()  {
	for (int i = 690; i > 390; i -= 2) {
	    drawL(i, 195);
	    sleep(40);
	    eraseL(i, 195);
	}
	drawL(390, 195);
    }
    
    // animates bird to fly right
    public void flyRight () {
	for (int i = 460; i < 750; i+=2) {
	    drawR(i, 195);
	    sleep(40);
	    eraseR(i, 195);
	}
    }
    
    public void run ()
    {
	flyLeft();
	sleep(11000);
	flyRight();
    }
}
	    
