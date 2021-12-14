/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Owl; chases rat at midnight
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Owl implements Runnable
{
    private Console c;
    private Palette p;
    
    public Owl (Console con, Palette pal) {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    private void drawOwl(int x, int y) {
	// fillPolygon, fillOval, drawArc, drawLine, 
	c.setColor(p.OWL_RWING);
	int[] rWingX = {x + 96, x + 94, x + 100, x + 90, x + 71, x + 63, x + 65};
	int[] rWingY = {y + 50, y + 41, y + 10, y, y + 20, y + 46, y + 72};
	c.fillPolygon(rWingX, rWingY, rWingX.length);

	c.setColor(p.OWL_HEAD_WHITE);
	int[] fX = {x + 110, x + 93, x + 83, x + 101, x + 122, x + 122, x + 114};
	int[] fY = {y + 79, y + 77, y + 99, y + 105, y + 100, y + 92, y + 89};
	c.fillPolygon(fX, fY, fX.length);
	
	c.setColor(p.OWL_HEAD_LIGHT);
	int[] hX = {x + 120, x + 114, x + 101, x + 88, x + 78, x + 79, x + 61, x + 80, x + 95, x + 116};
	int[] hY = {y + 51, y + 48, y + 47, y + 53, y + 65, y + 83, y + 123, y + 110, y + 85, y + 76};
	c.fillPolygon(hX, hY, hX.length);
	c.setColor(p.OWL_HEAD_DARK);
	c.fillOval(x + 91, y + 49, 32, 33);
	c.setColor(p.OWL_HEAD_WHITE);
	c.fillOval(x + 107, y + 53, 124 - 107, 79 - 53);
	c.setColor(Color.black);
	c.fillOval(x + 111, y + 61, 5, 5);
	c.drawLine(x + 116, y + 64, x + 120, y + 74);
	c.drawArc(x + 107, y + 53, 124 - 107, 79 - 53, 90, 180);
	    
	c.setColor(p.OWL_LWING);
	int[] lWingX = {x + 90, x + 59, x + 51, x + 20, x + 4, x, x + 2, x + 21, x + 46, x + 70, x + 89};
	int[] lWingY = {y + 60, y + 57, y + 49, y + 40, y + 49, y + 60, y + 79, y + 96, y + 97, y + 83, y + 62};
	c.fillPolygon(lWingX, lWingY, lWingX.length);
	
	c.setColor(p.OWL_FEET);
	int[] feetX = {x + 121, x + 140, x + 138, x + 131, x + 139, x + 137, x + 130, x + 131, x + 126, x + 121};
	int[] feetY = {y + 92, y + 89, y + 92, y + 94, y + 96, y + 99, y + 99, y + 105, y + 99, y + 99};
	c.fillPolygon(feetX, feetY, feetX.length);
    }
    
    // erase method
    public void erase(int x, int y) {
	c.setColor(p.MIDNIGHT);
	c.fillRect(x, y, 140, 123);
    }
    
    // animates the own swooping towards the rat
    public void swoop() {
	for (int i = -50; i < 170; i += 1) {
	    drawOwl(130 + i, -50 + 2 * i);
	    sleep(30);
	    erase(130 + i, -50 + 2 * i);
	}
    }
    
    // animates the owl chasing the rat
    public void chase() {
	for (int i = 0; i < 400; i += 3) {
	    drawOwl(300 + i, 290);
	    sleep(40);
	    erase(300 + i, 290);
	}
    }
    
    public void run ()
    {
	sleep(6000);
	swoop();
	chase();
    }
}
