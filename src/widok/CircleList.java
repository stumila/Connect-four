package widok;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Graphics;



public class CircleList {

	static int x0;
	static int y0;
  static class Circle
  {
    public int x, y, diameter;
    int gracz;
    public Circle(int i , int j, int gracz){
    	this.x=x0+2+j*50;
    	this.y=y0+2+i*50;
    	this.gracz=gracz;
    	diameter=46;
    }
  }

  ArrayList<Circle> circles;
  GradientPaint gradient;
 

  public  CircleList(int xp0, int yp0)
  {
	 CircleList.x0=xp0;
	 CircleList.y0=yp0;
    circles = new ArrayList<Circle>();
  }
  public void clearList(){
	  circles.clear();
  }
  
  public void adCircle(int i,int j,int gracz){
	  Circle kolo = new Circle(i,j,gracz);
	  circles.add(kolo);
  }
  
  public void drawCircle(Graphics g) // draw must be called by paintComponent of the panel
  {
	Graphics2D g2d = (Graphics2D)g;
    for (Circle c : circles){
    	if(c.gracz == 1){
    		//g.setColor(Color.BLUE);
    		gradient = new GradientPaint(c.x+30,c.y,Color.blue,c.x,c.y+40, Color.white);
    	}
    	else if(c.gracz==2){
    		gradient = new GradientPaint(c.x+30,c.y,Color.GREEN,c.x,c.y+40, Color.white);
    	}
    	g2d.setPaint(gradient);
    	g2d.fillOval(c.x, c.y, c.diameter, c.diameter);

    }
      
  }
}