package brickBreaker;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) 
	{
		JFrame obj = new JFrame();//create new object of type JFrame to represent the window
		Game gameplay = new Game(); //create object for gameplay
		obj.setBounds(10, 10, 700, 600); //set the size
		obj.setTitle("Break the Bricks"); //set the title
		obj.setResizable(false); //lock the size
		obj.setVisible(true); //make it visible
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make it stop when the window is closed	
		obj.add(gameplay); //add gameplay object to frame object
		
	}

}
