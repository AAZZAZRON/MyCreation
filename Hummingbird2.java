/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Hummingbird 2; hummingbird flies off with
	butterfly and its buddies
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Hummingbird2 implements Runnable
{
    private Console c;
    private Palette p;
    
    public Hummingbird2 (Console con, Palette pal) {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    private void draw (int x, int y) {
	// fillRoundRect, fillRect, fillPolygon, fillOval, fillArc
	// beak
	c.setColor (p.GOOSE_BEAK1);
	c.fillRoundRect (x, y+10, 30, 5, 5, 5);
	c.fillRect (x-30, y+30, 5, 17);
	c.fillRect (x-40, y+30, 5, 17);
	// body
	c.setColor(p.HUMMINGBIRD_BODY);
	int[] hx = {x-10, x-80, x-40, x-30};
	int[] hy = {y+10, y+25, y+40, y+38};
	c.fillPolygon (hx, hy, hx.length);
	// head
	c.setColor(p.HUMMINGBIRD_HEAD);
	c.fillOval(x-20, y, 25, 25);
	// wing
	c.setColor(p.HUMMINGBIRD_WING);
	c.fillArc (x-52, y-15, 40, 40, 150, 180);
	// tail
	int[] tx = {x-70, x-95, x-85, x-95, x-70};
	int[] ty = {y+25, y+15, y+25, y+35, y+28};
	c.fillPolygon (tx, ty, tx.length);
	// eye
	c.setColor (Color.white);
	c.fillRoundRect (x-8, y+8, 5, 5, 5, 5);
	
    }
     
    // erase method
    private void erase (int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x-95, y-5, 125, 60);
    }
    
    // animation method
    public void flyRight () {
	for (int i = -90; i < 1200; i+=2) {
	    draw(i, 190);
	    sleep(30);
	    erase(i, 190);
	}
    }
    
    public void run ()
    {
	flyRight();
    }
}
    

