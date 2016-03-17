package gen.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class Mesh extends Applet implements MouseListener{

	Color bgcolor = Color.CYAN;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screen_width = (int)(screenSize.getWidth());
	int screen_height = (int)(screenSize.getHeight());
	
	public void init(){
		
		this.setSize(new Dimension(screen_width, screen_height));
		this.setBackground(bgcolor);
		
	}
	
	public void paint(Graphics g){

		Random ran = new Random();
		
		int x = 0;
		int y = screen_height / 2;
		int x2 = 100;
		int y2 = screen_height / 2;
		
		int timesrange = 30;
		
		g.setColor(Color.DARK_GRAY);
		
		
		for(int count = 0; count <= 300; count++){
			
			int range = (ran.nextInt(7) - 3) * timesrange;
			
			y2 += range;
			x2 += 20;
			
			g.drawLine(x, y, x2, y2);
			g.drawLine(x2, screen_height, x2, y2);
			
			x += 20;
			y = y2;
			x = x2;
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		repaint();
		
	}
}
