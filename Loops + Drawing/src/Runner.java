import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		/*
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		/*
		int lines = 0;
		
		while (lines <= 100)
		{
			lines ++;
			int x1 = (int) (Math.random() * (380 - 10 + 1)) + 10;
			int y1 = (int) (Math.random() * (270 - 10 + 1)) + 10;
			int x2 = (int) (Math.random() * (380 - 10 + 1)) + 10;
			int y2 = (int) (Math.random() * (270 - 10 + 1)) + 10;
			int red = (int) (Math.random() * (255 - 0 + 1)) + 0;
			int green = (int) (Math.random() * (255 - 0 + 1)) + 0;
			int blue = (int) (Math.random() * (255 - 0 + 1)) + 0;
			g.setColor(new Color (red, green, blue));
			g2.drawLine(x1, y1, x2, y2);
		}
		
		int squares = 0;
		
		while (squares <= 100)
		{
			squares ++;
			int x1 = (int) (Math.random() * (720 - 385 + 1)) + 385;
			int y1 = (int) (Math.random() * (220 - 15 + 1)) + 15;
			int red = (int) (Math.random() * (255 - 0 + 1)) + 0;
			int green = (int) (Math.random() * (255 - 0 + 1)) + 0;
			int blue = (int) (Math.random() * (255 - 0 + 1)) + 0;
			g.setColor(new Color (red, green, blue));
			g2.fillRect(x1, y1, 50, 50);
		}
			
		int circles = 0;
		
		while (circles <= 100)
		{
			circles ++;
			int size = (int) (Math.random() * (200 - 0 + 1)) + 0;
			int x1 = (int) (Math.random() * (380 - size - 10 + 1)) + 10;
			int y1 = (int) (Math.random() * (550 - size - 275 + 1)) + 275;
			int red = (int) (Math.random() * (255 - 0 + 1)) + 0;
			int green = (int) (Math.random() * (255 - 0 + 1)) + 0;
			int blue = (int) (Math.random() * (255 - 0 + 1)) + 0;
			g.setColor(new Color (red, green, blue));
			g2.drawOval(x1, y1, size, size);
		}
		

		g.setColor(new Color (0, 0, 255));
		int [] x2 = {610, 650, 650, 610, 610};
		int [] y2 = {350, 400, 500, 450, 350};
		g.fillPolygon(x2, y2, 4);
		
		g.setColor(new Color (255, 255, 0));
		g2.fillRect(510, 350, 100, 100);
		
		g.setColor(new Color (255, 0, 0));
		g2.fillRect(550, 400, 100, 100);
		
		g.setColor(new Color (0, 255, 0));
		int [] x = {510, 550, 550, 510, 510};
		int [] y = {350, 400, 500, 450, 350};
		g.fillPolygon(x, y, 4);
		
	
	}
	
	*/
	


			
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
		
		g2.drawRect(10, 10, 800, 600);
		
		//int count = 0;
		
		//while (count <= 150)
		//{
			//int point1 = 5 * count;
			//int point2 = 10 * count;
			//g.drawLine(10 + point2, 10, 800, 10 + point1);
			//count++;
		//}
		
		int count2 = 0;
		
		while (count2 <= 100)
		{
			int point1 = 6 * count2;
			int point2 = 8 * count2;
			g.drawLine(810 - point2, 610, 10, 610 - point1);
			count2++;
		}
		
		//int count3 = 0;
		
		//while (count3 <= 150)
		//{
			//int point1 = 10 * count3;
			//int point2 = 8 * count3;
			//g.drawLine(10, 600 - point2, 10 + point1, 10);
			//count3++;
		//}
		
		int count4 = 0;
		
		while (count4 <= 100)
		{
			int point1 = 6 * count4;
			int point2 = 8 * count4;
			g.drawLine(10 + point2, 610, 810, 610 - point1);
			count4++;
		}
			
			
			
			
			
			  //Point A coordinates
			  int x1 = 810;
			  int y1 = 10;
			 
			  //Point B coordinates
			  int x2 = 810;
			  int y2 = 610;
			 
			  //loop that repeats 150 times
			  
			 // int counter = 0; //control variable
			  for(int counter = 0; counter <= 100; counter++){
				//draw the line
				g.drawLine(x1,y1,x2,y2);
			    
				//update point A so that it moves down
				 x1 -= 8;
			    
				//update point B so that it moves
				y2 -= 6;
			  }
				
				
				//Point A coordinates
				  int x11 = 10;
				  int y11 = 10;
				 
				  //Point B coordinates
				  int x22 = 10;
				  int y22 = 610;
				 
				  //loop that repeats 150 times
				  
				 // int counter = 0; //control variable
				  for(int counter = 0; counter <= 100; counter++){
					//draw the line
					g.drawLine(x11,y11,x22,y22);
				    
					//update point A so that it moves down
					x11 +=8;
				    
					//update point B so that it moves
					y22 -= 6;

			  }

	}
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
