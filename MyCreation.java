/*
    Programmers: Aaron Zhu and Taihan Mobasshir
    Teacher: Ms. Krasteva
    Date: November 18th, 2021
    Description: My Creation Assignment

    Our story is a coming of age story of a caterpillar. 
    One day, the caterpillar is crawling on the grass, 
    when suddenly a hawk swoops down and grabs the caterpillar into the air. 
    The caterpillar is scared, and awaits death. Miraculously, the hawk is 
    extremely happy, and forgets about its surroundings. They accidentally 
    bump into a tree, dropping the caterpillar in the meantime. The caterpillar 
    is saved. Tired, the caterpillar decides that now is a good time to cocoon 
    up, and become a butterfly. They climb a tree, and create a cocoon. 
    During the next few days, several animals wander around the cocoon, 
    such as a flock of geese, and an owl. 
    They are oblivious to the metamorphosing butterfly, as they go about 
    their day. When the time is up, the butterfly breaks open the cocoon, 
    and flies out. Happy, it flies around, and notices a meadow of flowers. 
    As the butterfly approaches the meadow, they meet a hummingbird, 
    and become friends. The butterfly and the hummingbird drink 
    nectar together, before flying high into the skies. 
    In the air, the butterfly meets other butterflies, and they fly off 
    into the distance. The End.
    
    Credits: Microsoft Paint to easily find coordinates for our animated characters
*/

import java.awt.*;
import hsa.Console;

public class MyCreation
{
    static Console c;
    static Palette p;

    public void background1 ()
    {
	Background1 b1 = new Background1 (c, p);
    }


    public void background2 ()
    {
	Background2 b2 = new Background2 (c, p);
    }


    public void background3 ()
    {
	Background3 b3 = new Background3 (c, p);
    }


    public void background4 ()
    {
	Background4 b4 = new Background4 (c, p);
    }


    public void background5 ()
    {
	Background5 b5 = new Background5 (c, p);
    }


    public void background6 ()
    {
	Background6 b6 = new Background6 (c, p);
    }


    public void background7 ()
    {
	Background7 b7 = new Background7 (c, p);
    }


    public void background8 ()
    {
	Background8 b8 = new Background8 (c, p);
    }


    public void hawk1 ()  // runnable
    {
	Hawk1 h1 = new Hawk1 (c, p);
	h1.run ();
    }


    public void hawk2 ()  // runnable
    {
	Hawk2 h2 = new Hawk2 (c, p);
	h2.run ();
    }


    public void hawk3 ()  // runnable
    {
	Hawk3 h3 = new Hawk3 (c, p);
	h3.run ();
    }


    public void caterpillar1 ()  // thread
    {
	Caterpillar1 c1 = new Caterpillar1 (c, p);
	c1.start ();
    }


    public void caterpillar2 ()  // thread
    {
	Caterpillar2 c2 = new Caterpillar2 (c, p);
	c2.start ();
    }


    public void caterpillar3 ()  // thread
    {
	Caterpillar3 c3 = new Caterpillar3 (c, p);
	c3.start ();
    }


    public void caterpillar4 ()  // thread
    {
	Caterpillar4 c4 = new Caterpillar4 (c, p);
	c4.start ();
	try
	{
	    c4.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void caterpillar5 ()  // thread
    {
	Caterpillar5 c5 = new Caterpillar5 (c, p);
	c5.start ();
	try
	{
	    c5.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void caterpillar6 ()  // thread
    {
	Caterpillar6 c6 = new Caterpillar6 (c, p);
	c6.start ();
	try
	{
	    c6.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void caterpillar7 ()  // thread
    {
	Caterpillar7 c7 = new Caterpillar7 (c, p);
	c7.start ();
	try
	{
	    c7.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void geese ()  // thread
    {
	Goose g1 = new Goose (c, p, 750, 380, 80, Color.black, true);
	g1.start ();
	Goose g2 = new Goose (c, p, 700, 300, 70, Color.black, Color.blue);
	g2.start ();
	Goose g3 = new Goose (c, p, 700, 200);
	g3.start ();
	Goose g4 = new Goose (c, p, 1100, 560, 70, Color.green, Color.orange);
	g4.start ();
	Goose g5 = new Goose (c, p, 1300, 550, Color.gray);
	g5.start ();
	Goose g6 = new Goose (c, p, 1000, 600, 60, p.BUTTERFLY_WING1);

	try
	{
	    g4.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void owl ()  // runnable
    {
	Owl o = new Owl (c, p);
	o.run ();
    }


    public void rat ()  // thread (not considered an animation)
    {
	Rat r = new Rat (c, p);
	r.start ();
    }


    public void hummingbird1 ()  // runnable
    {
	Hummingbird1 hm1 = new Hummingbird1 (c, p);
	hm1.run ();
    }


    public void hummingbird2 ()  // runnable
    {
	Hummingbird2 hm2 = new Hummingbird2 (c, p);
	hm2.run ();
    }


    public void butterfly1 ()  // thread
    {
	Butterfly1 bf1 = new Butterfly1 (c, p);
	bf1.start ();
	try
	{
	    bf1.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void butterfly2 ()  // thread
    {
	Butterfly2 bf2 = new Butterfly2 (c, p);
	bf2.start ();
    }


    public void butterfly3 ()  // thread
    {
	Butterfly3 bf3 = new Butterfly3 (c, p);
	bf3.start ();
    }


    public void butterflies ()  // thread
    {
	Butterflies bfs1 = new Butterflies (c, p, 5000, 100, 33, p.GREEN_LIGHT, p.GREEN_DARK, p.RED_DARK);
	bfs1.start ();
	Butterflies bfs2 = new Butterflies (c, p, 5000, 300, 15, p.BLUE_LIGHT, p.BLUE_DARK, p.GREEN_DARK);
	bfs2.start ();
	Butterflies bfs3 = new Butterflies (c, p, 5000, 250, 20, p.RED_LIGHT, p.RED_DARK, p.PINK_DARK);
	bfs3.start ();
	Butterflies bfs4 = new Butterflies (c, p, 5000, 280, 50, p.PINK_LIGHT, p.PINK_DARK, p.BLUE_DARK);
	bfs4.start ();
	Butterflies bfs5 = new Butterflies (c, p, 10000, 130, 33, p.PINK_DARK, p.GREEN_DARK, p.BLUE_LIGHT);
	bfs5.start ();
	Butterflies bfs6 = new Butterflies (c, p, 13000, 180, 10, p.BLUE_LIGHT, p.BLUE_DARK, p.GREEN_DARK);
	bfs6.start ();
	Butterflies bfs7 = new Butterflies (c, p, 12000, 225, 20, p.RED_LIGHT, p.BLUE_LIGHT, p.PINK_DARK);
	bfs7.start ();
    }


    public void end ()  // runnable
    {
	End endCard = new End (c, p);
	endCard.run ();
    }


    public MyCreation ()
    {
	c = new Console ("My Creation Animation");
	p = new Palette ();
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	
	// scene 1 -> hawk grab caterpillar
	z.background1 ();
	z.caterpillar1 ();
	z.hawk1 ();
	z.caterpillar2 ();
	z.hawk2 ();

	// scene 2 -> hawk bump into tree
	z.background2 ();
	z.caterpillar3 ();
	z.hawk3 ();
	z.caterpillar4 ();

	// scene 3 -> caterpillar builds cocoon
	z.background3 ();
	z.caterpillar5 ();
	z.caterpillar6 ();
	z.caterpillar7 ();

	// scene 4 -> flock of geese (overloaded) fly by the cocoon
	z.background4();
	z.geese ();
	
	// scene 5 -> owl chases rat (midnight)
	z.background5 ();
	z.rat ();
	z.owl ();
	
	// scene 6 -> butterfly hatches
	z.background6 ();
	z.butterfly1 ();
	
	// scene 7 -> butterfly meets hummingbird
	z.background7 ();
	z.butterfly2 ();
	z.hummingbird1 ();
	
	// scene 8 -> Final Scene: hummingbird & butterfly + butterfly swarm
	z.background8 ();
	z.butterflies ();
	z.butterfly3 ();
	z.hummingbird2 ();
	
	// end
	z.end ();
    }
}
