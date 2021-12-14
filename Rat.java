/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Rat; gets chased by owl \
    (not an animation)
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Rat extends Thread
{
    private Console c;
    private Palette p;
    
    public Rat (Console con, Palette pal) {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    private void drawRat(int x, int y, int legs) {
	// fillPolygon, drawLine
	c.setColor(p.RAT); // only draw shadow
	int[] rX = {x + 105, x + 90, x + 59, x + 49, x, x + 21, x + 51, x + 55, x + 73, x + 87, x + 108, x + 122};
	int[] rY = {y + 2, y + 6, y + 5, y + 10, y + 23, y + 23, y + 15, y + 23, y + 20, y + 22, y + 15, y + 13};
	c.fillPolygon(rX, rY, rX.length);
	if (legs % 36 < 18) {
	    c.drawLine(x + 54, y + 22, x + 49, y + 30);
	    c.drawLine(x + 52, y + 16, x + 43, y + 29);
	    int[] fX = {x + 90, x + 112, x + 114,x + 95};
	    int[] fY = {y + 20, y + 29, y + 25, y + 16};
	    c.fillPolygon(fX, fY, fX.length);
	} else {
	    c.drawLine(x + 54, y + 22, x + 63, y + 30);
	    c.drawLine(x + 52, y + 16, x + 74, y + 28);
	    int[] fX = {x + 90, x + 82, x + 84, x + 100};
	    int[] fY = {y + 20, y + 25, y + 29, y + 16};
	    c.fillPolygon(fX, fY, fX.length);
	}   
    }
    
    public void erase(int x, int y) {
	if (x < 100) c.setColor(p.TREE_BROWN_DARK);
	else c.setColor(p.MIDNIGHT);
	c.fillRect(x, y + 2, 122, 29); 
    }

    public void moveRight() {
	for (int i = 0; i < 280; i += 2) {
	    drawRat(i - 130, 395, i);
	    sleep(50);
	    erase(i - 130, 395);
	}
	for (int i = 280; i < 810; i += 3) {
	    drawRat(i - 130, 395, i);
	    sleep(45);
	    erase(i - 130, 395);
	}
    }
    
    public void run ()
    {
	sleep(500);
	moveRight();
    }
}
