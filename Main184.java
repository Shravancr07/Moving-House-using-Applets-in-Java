/*
<applet code="Main184.class" width=400 height=450></applet>
*/

import java.awt.*;

import java.applet.*;

import java.util.*;
 

public class Main184 extends Applet implements Runnable

{
    int xRect=150,yRect=150,x1Rect=200,y1Rect=200,xPol=300,x1Pol=225,x2Pol=25;

public void init()

{
	setBackground(new Color(123,47,223));

}
    
public void start()
    
{
        Thread th = new Thread(this);
        
th.start();

    }


public void paint(Graphics gp)

{
    int [] x = {xRect, xPol, x1Pol};
 
   int [] y = {150, 150, x2Pol};

    gp.drawRect(xRect, yRect, 150, 200); //House
  
  gp.setColor(Color.red);
 
   gp.fillRect(xRect,yRect, 150, 200);
  
  gp.drawRect(x1Rect, y1Rect, 50, 150); // Door
 
   gp.setColor(Color.green);

    gp.fillRect(x1Rect,y1Rect, 50, 150);
 
gp.drawPolygon(x, y, 3); // Roof
  
  gp.setColor(Color.blue);
   
 gp.fillPolygon(x, y, 3);
  
 gp.drawOval(x1Rect, 75, 50, 50); // Skylight
 
   gp.setColor(Color.yellow);

    gp.fillOval(x1Rect, 75, 50, 50);
 
   
}
    
public void run()
  
  {

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
  
      while(true)

        {
        
    		xRect = xRect+1;
   
        	x1Rect = x1Rect+1;
 
		xPol = xPol+1;
		x1Pol=x1Pol+1;
		x2Pol = x2Pol; 
          	repaint();

         try
   
         {
         
       		Thread.sleep(200);
    
         }
     
       	 catch(InterruptedException Ex)
   
         {
   
         	}
   
     }
    
 }

}
