package Main;

import javax.swing.JFrame;

public class Game implements Runnable{
	
	Thread mainThread = new Thread("Main Game Thread", new Game());
	
	public void run() {
		
		JFrame window = new JFrame("Dragon Tale");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
	}
	
	public static void main(String args[]) {
	 
	  mainThread.start();
	  
	}
	
}
