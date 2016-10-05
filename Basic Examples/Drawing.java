import javax.swing.*;
import java.awt.*;

public class Drawing {
	
	public static void main(String[] args){
		
		JFrame gui = new JFrame();
		gui.setTitle("My Visual Application");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(600,600);
		gui.setVisible(true);
		
		ColorPanel panel = new ColorPanel(Color.white);
		Container pane = gui.getContentPane();
		pane.add(panel);
		
	}
	
	public static class ColorPanel extends JPanel{
		public ColorPanel(Color backColor){
			setBackground(backColor);
			
		}
		
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect(10,10,400,400);
			
			g.setColor(Color.red);
			g.fillOval(20,20,400,400);
			
			g.setColor(Color.green);
			g.drawArc(10,25,50,50,0,90);
			
			g.setColor(Color.orange);
			g.drawRoundRect(10,25,40,30,20,20);
			
			g.setColor(Color.black);
			g.drawString("Java is wicked cool.", 10, 50);
			
		}
	}
	
	
	
	
}