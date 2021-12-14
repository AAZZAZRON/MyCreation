/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment - Hawk 2; caterpillar flies up with caterpillar
*/

import java.awt.*;
import java.lang.*;
import hsa.Console;

public class Hawk2 implements Runnable
{
    private Console c;
    private Palette p;
    int size = 2;
    
    public Hawk2 (Console con, Palette pal) {
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
    
    // based on //media.istockphoto.com/vectors/vector-cartoon-hawk-eagle-or-falcon-diving-or-swooping-vector-id546449354
    private void drawSwoop(int x, int y) {
	// fillPolygon, fillOval, fillArc, drawLine
	c.setColor(p.HAWK_HEAD); // head colour
    
	int[] topX = {10, 14, 19, 29, 27, 40, 38, 25, 19, 20};
	int[] topY = {56, 49, 41, 30, 40, 33, 53, 69, 70, 56};
	c.fillPolygon(space(topX, x), space(topY, y), topX.length);
	
	c.fillOval(x + size * 10, y + size * 53, size * 15, size * 13);
	
	c.setColor(p.HAWK_BODY); // body/tail colour
	
	int[] bodyX = {21, 19, 16, 25, 27, 33, 50, 37};
	int[] bodyY = {70, 77, 82, 92, 83, 90, 73, 55};
	c.fillPolygon(space(bodyX, x), space(bodyY, y), bodyX.length);
	
	int[] tailX = {42, 58, 55, 70, 62, 69, 65, 52, 45, 30};
	int[] tailY = {74, 65, 72, 60, 73, 70, 76, 82, 81, 74};
	c.fillPolygon(space(tailX, x), space(tailY, y), tailX.length);
	
	c.setColor(p.HAWK_WINGS); // wings colour
	
	int[] lWingX = {15, 7, 2, 8, 17, 18, 16, 24, 25, 23};
	int[] lWingY = {50, 53, 41, 45, 28, 34, 40, 27, 34, 38};
	c.fillPolygon(space(lWingX, x), space(lWingY, y), lWingX.length);
	
	int[] rWingX = {28, 39, 34, 34, 41, 42, 47, 59, 71, 68, 89, 77, 90, 78, 62, 81, 63, 48, 70, 50, 31};  
	int[] rWingY = {56, 39, 40, 27, 16, 26, 29, 18, 7, 20, 3, 21, 14, 30, 38, 36, 49, 52, 50, 65, 57};
	c.fillPolygon(space(rWingX, x), space(rWingY, y), rWingX.length);
	
	c.setColor(p.HAWK_BEAK); // beak/feet colour
	
	c.fillArc(x + size * 10, y + size * 57, size * 10, size * 15, 160, 100);
    
	int[] lFootX = {18, 11, 11, 6, 6, 10, 18};
	int[] rFootX = {30, 23, 23, 18, 18, 22, 30};
	int[] footY = {81, 92, 85, 85, 88, 97, 85};
	c.fillPolygon(space(lFootX, x), space(footY, y), lFootX.length);
	c.fillPolygon(space(rFootX, x), space(footY, y), rFootX.length);
	
	c.setColor(Color.black);
	c.fillOval(x + 27, y + 113, 7, 7);
	c.drawLine(x + 65, y + 150, x + 50, y + 170);
	c.drawLine(x + size * 89, y + size * 3, x + size * 58, y + size * 29);
	c.drawLine(x + size * 48, y + size * 45, x + size * 81, y + size * 36);
	c.drawLine(x + size * 70, y + size * 50, x + size * 35, y + size * 56);
    }
    
    public void erase(int x, int y) {
	c.setColor(p.DAY_BLUE);
	c.fillRect(x + 2 * size, y + 3 * size, 88 * size, 94 * size);
    }
    
    public void swoop() {
	for (int i = 0; i < 220; i += 2) {
	    drawSwoop(420 - i, 200 - i*2); // draw
	    sleep(40);
	    erase(420 - i, 200 - i*2);
	}
    }
    
    public void run ()
    { 
	swoop ();
    }
}
    
    
