/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Background 7
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Background7
{
    private Console c;
    private Palette p;
	
    public void draw ()
    {
	// ---- Sky ----
	c.setColor (p.DAY_BLUE);
	c.fillRect (0, 0, 800, 500);
	
	       
	// ---- Sun ----
	c.setColor (p.SUN_NOON);
	for (int i = 0; i < 100; i += 1) {
	    c.drawOval(505 + i / 2, -45 + i / 2, 100 - i, 100 - i);
	}
	
	// ---- Clouds ----
	drawCloud(470, 20);
	drawCloud(300, 80);
	drawCloud(80, 40);
	
	// ---- Flowers ----
	drawFlower(290, 260, Color.red);
	drawFlower(200, 350, Color.magenta);
	drawFlower(30, 300, Color.white);
	drawFlower(480, 320, Color.blue);
	drawFlower(550, 400, Color.pink);
	
       
    }
    // Draws a cloud given it's x, y position
    public void drawCloud (int x, int y) {
	c.setColor(Color.white);
	c.fillOval(x, y, 100, 50);
	c.fillOval(x-15, y+5, 40, 30);
	c.fillOval(x-20, y+20, 60, 30);
	c.fillOval(x-5, y+10, 20, 20);
	c.fillOval(x+5, y-10, 30, 30);
	c.fillOval(x+25, y-5, 30, 15);
	c.fillOval(x+45, y-15, 40, 30);
	c.fillOval(x+80, y-5, 30, 20);
	c.fillOval(x+90, y+5, 30, 20);
	c.fillOval(x+80, y+15, 50, 30);
    }
    // Draws a flower given its x, y position and color of its petals
    public void drawFlower (int x, int y, Color petal) {
    
	c.setColor(p.LEAVES_DARK);
	c.fillRect(x+30, y+40, 10, 200);
	
	c.setColor(p.TREE_BROWN_LIGHT);
	c.fillOval(x, y, 80, 80);
	
	c.setColor(Color.black);
	c.fillOval(x-12, y-12, 35, 35);
	c.fillOval(x+17, y-27, 35, 35);
	c.fillOval(x+45, y-17, 35, 35);
	c.fillOval(x+62, y+12, 35, 35);
	c.fillOval(x+57, y+42, 35, 35);
	c.fillOval(x+33, y+62, 35, 35);
	c.fillOval(x+3, y+57, 35, 35);
	c.fillOval(x-17, y+36, 35, 35);
	c.fillOval(x-22, y+8, 35, 35);
	
	c.setColor(petal);
	c.fillOval(x-10, y-10, 35, 35);
	c.fillOval(x+15, y-25, 35, 35);
	c.fillOval(x+43, y-15, 35, 35);
	c.fillOval(x+60, y+10, 35, 35);
	c.fillOval(x+55, y+40, 35, 35);
	c.fillOval(x+35, y+60, 35, 35);
	c.fillOval(x+5, y+55, 35, 35);
	c.fillOval(x-15, y+35, 35, 35);
	c.fillOval(x-20, y+10, 35, 35);
	
	
    } 
    
    public Background7 (Console con, Palette pal)
    {
	c = con;
	p = pal;
	draw();
    }
}
