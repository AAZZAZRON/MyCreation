/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Background 1
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Background1
{
    private Console c;
    private Palette p;
    
    // Draws a rock given it's x, y position, sizes, and color
    private void drawRock(int x, int y, int sX, int sY, Color col) {
	c.setColor(col);
	int[] rockX = {x + sX * 2, x + sX * 9, x + sX * 18, x + sX * 18, x + sX * 17, x + sX * 13, x + sX * 9, x + sX * 6, x + sX * 2, x + sX, x};
	int[] rockY = {y + sY * 12, y + sY * 13, y + sY * 12, y + sY * 8, y + sY * 4, y + sY * 2, y + sY * 2, y + sY * 3, y + sY * 5, y + sY * 6, y + sY * 8};
	c.fillPolygon(rockX, rockY, rockX.length);
    }
    
    // Draws a patch of grass given it's x, y position, sizes, and color
    private void drawGrass(int x, int y, int sX, int sY, Color col) {
	c.setColor(col);
	int[] grassX = {x + sX * 3, x + sX * 15, x + sX * 18, x + sX * 14, x + sX * 15, x + sX * 12, x + sX * 9, x + sX * 9, x + sX * 7, x + sX * 6, x + sX, x + sX * 4, x};
	int[] grassY = {y + sY * 9, y + sY * 9, y + sY * 3, y + sY * 6, y + sY, y + sY * 4, y, y + sY * 5, y, y + sY * 4, y, y + sY * 6, y + sY * 5};
	c.fillPolygon(grassX, grassY, grassX.length);
    }
    
    public void draw ()
    {
	// ---- Sky ----
	c.setColor (p.DAY_BLUE);
	c.fillRect (0, 0, 800, 480);
	
	// ---- Ground ----
	c.setColor (p.GROUND_GREEN);
	c.fillRect (0, 425, 800, 600);
	
	// ---- Sun ----
	c.setColor (p.SUN_NOON);
	for (int i = 0; i < 100; i += 1) {
	    c.drawOval(505 + i / 2, -45 + i / 2, 100 - i, 100 - i);
	}
	
	// ---- Rocks ----
	drawRock(300, 450, 2, 2, p.ROCK_LIGHT);
	drawRock(150, 434, 3, 2, p.ROCK_DARK);
	drawRock(-20, 460, 2, 3, p.ROCK_LIGHT);
	drawRock(400, 455, 3, 3, p.ROCK_MEDIUM);
	drawRock(500, 430, 2, 2, p.ROCK_DARK);
	drawRock(570, 470, 2, 1, p.ROCK_MEDIUM);
	drawRock(100, 470, 2, 1, p.ROCK_LIGHT);
	
	// ---- Grass ----
	drawGrass(50, 480, 3, 3, p.GRASS_DARK);
	drawGrass(200, 470, 3, 4, p.GRASS_DARK);
	drawGrass(500, 465, 2, 3, p.GRASS_DARK);
	drawGrass(30, 450, 3, 2, p.GRASS_LIGHT);
	drawGrass(230, 430, 4, 3, p.GRASS_LIGHT);
	drawGrass(350, 470, 2, 2, p.GRASS_LIGHT);
	drawGrass(600, 430, 3, 2, p.GRASS_LIGHT);
	
	// ---- Clouds ----
	drawCloud(170, 320);
	drawCloud(100, 280);
	drawCloud(80, 40);
		
	// ---- Big Tree ----
	c.setColor (p.TREE_BROWN);
	int[] tx = {0, 150, 100, 80, 75, 69, 75, 71, 68, 65, 90, 150, 175, 150, 100, 65, 60, 58, 80, 95, 105, 125, 135, 120, 100, 90, 75, 65, 55, 50, 45, 70, 0};
	int[] ty = {425, 425, 405, 370, 320, 300, 280, 260, 200, 160, 150, 140, 146, 128, 132, 135, 115, 100, 80, 50, 45, 40, 10, 30, 35, 40, 70, 80, 75, 70, 20, 0, 0};
	c.fillPolygon (tx, ty, tx.length);
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
    
    public Background1 (Console con, Palette pal)
    {
	c = con;
	p = pal;
	draw();
    }
}