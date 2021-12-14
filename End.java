/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - End credits
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class End implements Runnable
{
    private Console c;
    private Palette p;
    
    public End (Console con, Palette pal)
    {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    public void draw (int x, int y)
    {
	c.setColor (Color.black);
	c.fillRect (x, y, 700, 500);
	
	c.setColor (Color.white);
	c.setTextColor (Color.white);
	c.setFont (new Font ("Cambria", Font.BOLD, 120));
	c.drawString ("Caution", x+110, y+150);
	c.drawString ("Aviation", x+90, y+250);
	c.setFont (new Font ("Cambria", Font.BOLD, 20));
	c.drawString ("A coming of age story portrayed through the life cycle of a butterfly", x+15, y+320);
	c.setFont (new Font ("Cambria", Font.BOLD, 35));
	c.drawString ("By Aaron Zhu & Taihan Mobasshir", x+40, y+380);
    }
    
    private void endCredits () {
	for (int i = -640; i <= 0; i += 2) {
	    draw(0, i);
	    sleep (15);
	}
    }
    
    public void run () {
	endCredits ();
    }
}
