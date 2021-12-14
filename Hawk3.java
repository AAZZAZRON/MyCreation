/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Hawk 3; hawk flies left with caterpillar
	bumps into tree
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Hawk3 implements Runnable
{
    private Console c;
    private Palette p;
    int size = 5;
    
    public Hawk3 (Console con, Palette pal) {
	c = con;
	p = pal;
    }
    
    private void sleep(int s) {
	try {
	    Thread.sleep(s);
	} catch (Exception e) {}
    }
    
    // buffer all the pixels so I don't have to manually do it
    private int[] space(int[] arr, int buffer) {
	int[] tmp = new int[arr.length];
	for (int i = 0; i < arr.length; i += 1) tmp[i] = buffer + arr[i] * size;
	return tmp;
    }
    
    private void flyLeft(int x, int y) {
	// fillPolygon, fillOval, fillArc, drawLine
	c.setColor(p.HAWK_HEAD);
	int[] headX = {14, 20, 23, 20, 16, 12};
	int[] headY = {16, 18, 33, 34, 32, 30};
	c.fillPolygon(space(headX, x), space(headY, y), headX.length);

	c.fillOval(x + 10 * size, y + 25 * size, 8 * size, 6 * size);
    
	c.setColor(p.HAWK_BEAK);
	c.fillArc(x + 8 * size, y + 28 * size - size / 2, 8 * size, 3 * size, 100, 100);
	
	int[] rFootX = {30, 30, 30, 31, 31, 32, 32, 35, 32, 33, 31};
	int[] rFootY = {31, 35, 36, 35, 38, 37, 35, 37, 34, 32, 34};
	c.fillPolygon(space(rFootX, x), space(rFootY, y), rFootX.length);
	
	int[] lFootX = {25, 25, 25, 26, 26, 27, 27, 30, 27, 28, 26};
	int[] lFootY = {31, 35, 36, 35, 38, 37, 35, 37, 34, 32, 34};
	c.fillPolygon(space(lFootX, x), space(lFootY, y), lFootX.length);
	
	c.setColor(p.HAWK_BODY);
	int[] bodyX = {20, 28, 38, 42, 30, 32, 28, 23};
	int[] bodyY = {18, 26, 22, 28, 28, 32, 34, 33};
	c.fillPolygon(space(bodyX, x), space(bodyY, y), bodyX.length);
	
	c.setColor(p.HAWK_WINGS);
	int[] rWingX = {24, 30, 42, 42, 48, 44, 48, 44, 38, 44, 42, 38, 42, 36, 34, 38, 34, 20};
	int[] rWingY = {20, 12,  2,  4,  0,  8,  4, 10, 14, 12, 16, 18, 18, 22, 24, 24, 28, 28};
	c.fillPolygon(space(rWingX, x), space(rWingY, y), rWingX.length);
	
	int[] lWingX = {14, 10,  1, 0, 6,  8, 8, 12, 12, 18, 20, 26};
	int[] lWingY = {28, 20, 12, 6, 8, 10, 8, 14, 10, 16, 16, 26};
	c.fillPolygon(space(lWingX, x), space(lWingY, y), lWingX.length);

	c.setColor(Color.black);
	c.fillOval(x + 59, y + 135, 7, 7);
	c.drawLine(x + size * 47, y + size, x + size * 40, y + size * 8);
	c.drawLine(x + size * 44, y + size * 10, x + size * 30, y + size * 18);
	c.drawLine(x + size * 42, y + size * 16, x + size * 34, y + size * 20);
	c.drawLine(x + size * 28, y + size * 26, x + size * 38, y + size * 24);
	
	c.drawLine(x + size * 6, y + size * 8, x + size * 10, y + size * 15);
	c.drawLine(x + size * 16, y + size * 14, x + size * 17, y + size * 18);
	c.drawLine(x + size * 10, y + size * 20, x + size * 18, y + size * 25);
    }
    
    public void erase(int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x, y, 48 * size, 38 * size);
    }
    
    public void hawkFlyLeft() {
	for (int i = 640; i > 60; i -= 3) {
	    erase(i + 3, 100);
	    flyLeft(i, 100);
	    sleep(35);
	}
    }
    
    public void run ()
    { 
	hawkFlyLeft();
    }
}
