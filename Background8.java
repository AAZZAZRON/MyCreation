/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Background 8
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Background8
{
    private Console c;           // The output console
    private Palette p;
    
    public Background8(Console con, Palette pal) {
	c = con;
	p = pal;
	draw();
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
    
    public void draw() {
	// sky
	c.setColor(p.DAY_BLUE);
	c.fillRect(0, 0, 640, 500);
	
	// sun
	c.setColor(p.SUN_MIDDAY);
	for (int i = 0; i < 100; i += 1) {
	    c.drawOval(380 + i / 2, -35 + i / 2, 100 - i, 100 - i);
	}
	
	// clouds
	c.setColor(Color.white);
	c.fillOval(170, 50, 20, 20);
	c.fillOval(180, 50, 40, 40);
	c.fillOval(200, 30, 60, 60);
	c.fillOval(250, 50, 20, 20);
	c.fillOval(230, 40, 60, 40);
	c.fillOval(240, 60, 30, 30);
	
	c.fillOval(340, 50, 20, 20);
	c.fillOval(350, 40, 40, 40);
	c.fillOval(370, 30, 60, 60);
	c.fillOval(420, 40, 20, 20);
	c.fillOval(390, 30, 60, 40);
	c.fillOval(410, 60, 30, 30);
	
	c.fillOval(520, 40, 30, 30);
	c.fillOval(530, 40, 50, 50);
	c.fillOval(550, 30, 70, 70);
	c.fillOval(600, 30, 70, 50);
	c.fillOval(590, 60, 40, 40);
	
	drawCloud(-10, 50);
	
	// tree 1
	c.setColor(p.LEAVES_DARK);
	c.fillOval(402, 408, 51, 30);
	c.fillOval(375, 405, 36, 24);
	c.setColor(p.TREE_BROWN_LIGHT);
	int[] trunk1X = {405, 405, 390, 450, 417};
	int[] trunk1Y = {408, 465, 504, 504, 405};
	c.fillPolygon(trunk1X, trunk1Y, trunk1X.length);
	c.setColor(p.LEAVES_LIGHT);
	c.fillOval(357, 381, 54, 36);
	c.fillOval(375, 366, 60, 54);
	c.fillOval(396, 351, 66, 51);
	c.fillOval(417, 369, 72, 54);
	
	// tree 2
	c.setColor(p.LEAVES_DARK);
	c.fillOval(332, 478, 51, 30);
	c.fillOval(305, 475, 36, 24);
	c.setColor(p.TREE_BROWN_LIGHT);
	int[] trunk2X = {335, 335, 320, 380, 347};
	int[] trunk2Y = {478, 535, 574, 574, 475};
	c.fillPolygon(trunk2X, trunk2Y, trunk2X.length);
	c.setColor(p.LEAVES_LIGHT);
	c.fillOval(287, 451, 54, 36);
	c.fillOval(305, 436, 60, 54);
	c.fillOval(326, 421, 66, 51);
	c.fillOval(347, 439, 72, 54);
	
	// tree 3
	c.setColor(p.LEAVES_DARK);
	c.fillOval(472, 428, 51, 30);
	c.fillOval(445, 425, 36, 24);
	c.setColor(p.TREE_BROWN_LIGHT);
	int[] trunk3X = {484, 475, 460, 520, 499};
	int[] trunk3Y = {437, 485, 524, 524, 425};
	c.fillPolygon(trunk3X, trunk3Y, trunk3X.length);
	c.setColor(p.LEAVES_LIGHT);
	c.fillOval(436, 401, 54, 36);
	c.fillOval(445, 386, 60, 54);
	c.fillOval(466, 371, 66, 51);
	c.fillOval(481, 389, 72, 54);
	
	// tree 4
	c.setColor(p.LEAVES_DARK);
	c.fillOval(575, 468, 51, 30);
	c.fillOval(545, 465, 36, 24);
	c.setColor(p.TREE_BROWN_LIGHT);
	int[] trunk4X = {590, 575, 560, 605, 599};
	int[] trunk4Y = {477, 525, 564, 564, 465};
	c.fillPolygon(trunk4X, trunk4Y, trunk4X.length);
	c.setColor(p.LEAVES_LIGHT);
	c.fillOval(536, 441, 54, 36);
	c.fillOval(545, 426, 60, 54);
	c.fillOval(566, 411, 66, 51);
	c.fillOval(581, 429, 72, 54);  
	
	// tree 5
	c.setColor(p.LEAVES_DARK);
	c.fillOval(132, 428, 51, 30);
	c.fillOval(105, 425, 36, 24);
	c.setColor(p.TREE_BROWN_LIGHT);
	int[] trunk5X = {144, 135, 120, 180, 159};
	int[] trunk5Y = {437, 485, 524, 524, 425};
	c.fillPolygon(trunk5X, trunk5Y, trunk5X.length);
	c.setColor(p.LEAVES_LIGHT);
	c.fillOval(96, 401, 54, 36);
	c.fillOval(105, 386, 60, 54);
	c.fillOval(126, 371, 66, 51);
	c.fillOval(141, 389, 72, 54);
	
	// tree 6
	c.setColor(p.LEAVES_DARK);
	c.fillOval(32, 478, 51, 30);
	c.fillOval(05, 475, 36, 24);
	c.setColor(p.TREE_BROWN_LIGHT);
	int[] trunk6X = {35, 35, 20, 80, 47};
	int[] trunk6Y = {478, 535, 574, 574, 475};
	c.fillPolygon(trunk6X, trunk6Y, trunk6X.length);
	c.setColor(p.LEAVES_LIGHT);
	c.fillOval(0, 451, 54, 36);
	c.fillOval(5, 436, 60, 54);
	c.fillOval(26, 421, 66, 51);
	c.fillOval(47, 439, 72, 54);
	
	// tree 7
	c.setColor(p.LEAVES_DARK);
	c.fillOval(225, 458, 51, 30);
	c.fillOval(195, 455, 36, 24);
	c.setColor(p.TREE_BROWN_LIGHT);
	int[] trunk7X = {240, 225, 210, 255, 249};
	int[] trunk7Y = {467, 515, 554, 554, 455};
	c.fillPolygon(trunk7X, trunk7Y, trunk7X.length);
	c.setColor(p.LEAVES_LIGHT);
	c.fillOval(186, 431, 54, 36);
	c.fillOval(195, 416, 60, 54);
	c.fillOval(216, 401, 66, 51);
	c.fillOval(231, 419, 72, 54); 
    }
} // Background8 class
