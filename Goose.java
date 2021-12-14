/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Overloaded geese
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Goose extends Thread
{
    private Console c;
    private Palette p;
    private int speed;
    private Color feathers;
    private Color head;
    private int xCoord;
    private int yCoord;
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    private void draw(int x, int y) {
	// fillPolygon, fillRect, drawLine, fillOval, fillRoundRect
	
	// goose beak
	c.setColor(p.GOOSE_BEAK1);
	int[] bx = {x, x-15, x};
	int[] by = {y+5, y+10, y+15};
	c.fillPolygon (bx, by, 3);
	c.fillRect (x+65, y+20, 5, 10);
	c.fillRect (x+75, y+20, 5, 10);
	// goose feet
	c.setColor(p.GOOSE_BEAK2);
	c.drawPolygon (bx, by, 3);
	c.drawRect (x+65, y+20, 5, 10);
	c.drawRect (x+75, y+20, 5, 10);
	// goose feathers (body, neck, wing, tail)
	c.setColor(feathers);
	int[] wx = {x+45, x+70, x+90, x+55};
	int[] wy = {y, y-20, y-10, y};
	c.fillPolygon(wx, wy, wx.length);
	
	int[] tx = {x+95, x+115, x+115, x+95};
	int[] ty = {y, y-10, y+10, y+5};
	c.fillPolygon(tx, ty, tx.length);
	
	c.setColor(Color.black);
	c.drawLine(x+44, y+3, x+75, y-15);
	c.drawLine(x+44, y, x+82, y-12);
	
	c.setColor(Color.white);
	c.fillRect(x+15, y+5, 30, 9);
	c.setColor(head);
	c.fillOval(x, y, 20, 20);
	c.setColor(feathers);
	c.fillRoundRect (x+45, y-3, 50, 25, 10, 10);
	
	c.setColor(Color.black);
	c.fillOval(x+5, y+4, 5, 5);
    }
    
    // erase method
    private void erase(int x, int y) {
	c.setColor(p.SUNSET);
	c.fillRect(x-15, y-20, 131, 51);
    }
    
    // animation
    public void gooseFly() {
	int i = 0;
	while (yCoord - 2 * i >= -50) {
	    draw(xCoord-i*3, yCoord-i*2);
	    sleep(speed);
	    erase(xCoord-i*3, yCoord-i*2);
	    i += 1;
	}
    }
    
    public Goose (Console con, Palette pal, int x, int y) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = (Color.white);
	head = (Color.white);
	speed = 50;
    } // default
    
    public Goose (Console con, Palette pal, int x, int y, int delay) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = (Color.white);
	head = (Color.white);
	speed = delay;
    } // change speed of goose
    
    public Goose (Console con, Palette pal, int x, int y, Color f) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = f;
	head = (Color.white);
	speed = 50;
    } // change feather color
    
    public Goose (Console con, Palette pal, int x, int y, int delay, Color f) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = f;
	head = (Color.white);
	speed = delay;
    } // change speed and feather color
    
    public Goose (Console con, Palette pal, int x, int y, int delay, Color h, boolean yesNo) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = (Color.white);
	head = h;
	speed = delay;
    } // change speed and head color
    
    public Goose (Console con, Palette pal, int x, int y, Color h, boolean yesNo) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = (Color.white);
	head = h;
	speed = 50;
    } // change head color
    
    public Goose (Console con, Palette pal, int x, int y, Color f, Color h) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = f;
	head = h;
	speed = 50;
    } // change feather and head color
    
    public Goose (Console con, Palette pal, int x, int y, int delay, Color f, Color h) {
	c = con;
	p = pal;
	xCoord = x;
	yCoord = y;
	feathers = f;
	head = h;
	speed = delay;
    } // change speed, feather, and head color
    
    public void run ()
    {
	sleep(1500);
	gooseFly ();
    }
}
      
	
