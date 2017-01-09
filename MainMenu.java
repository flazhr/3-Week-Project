import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainMenu extends JFrame implements ActionListener 
{

	//Declarations
	private JButton host, join, quit;
	private JLabel welcome;
	
	public MainMenu()
	{
		//Define layout
		getContentPane().setLayout(new BorderLayout());
		
		//Default button
		Dimension bSize = new Dimension(125, 35);
		
		//Host button
        host = new JButton("Host Game");
        host.addActionListener(this);
        host.setMaximumSize(bSize);
        host.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Join button
        join = new JButton("Join Game");
        join.addActionListener(this);
        join.setMaximumSize(bSize);
        join.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Quit button
        quit = new JButton("Quit");
        quit.addActionListener(this);
        quit.setMaximumSize(bSize);
        quit.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Setup JPanel to hold buttons
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        p1.add(Box.createRigidArea(new Dimension(210, 100)));
        p1.add(host);
        p1.add(Box.createRigidArea(new Dimension(210, 12)));
        p1.add(join);
        p1.add(Box.createRigidArea(new Dimension(210, 12)));
        p1.add(quit);
        
        //Implement JPanel
        getContentPane().add(p1, BorderLayout.CENTER);
        
        //Default label
        Dimension lSize = new Dimension(200, 30);
        
        // #1
        welcome = new JLabel ("Welcome to Memory Puzzle!");
        welcome.setMaximumSize (lSize);
        
        //Setup JPanel to hold Welcome Label
        JPanel p2 = new JPanel() ;
        p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
        p2.add(Box.createRigidArea(new Dimension(180, 30)));
        p2.add(welcome);
        p2.add(Box.createRigidArea(new Dimension(180, 1)));
        
        //Implement JPanel
        getContentPane().add(p2, BorderLayout.NORTH);
	}
	
	
	//Button actions
	public void actionPerformed(ActionEvent e) 
	{
		 if (e.getSource() == quit) 
		 {
			 System.exit(0);
		 }
		 
	     else if (e.getSource() == host) 
	     {
	        //Setup Host
	     }
		 
	     else if (e.getSource() == join) 
	     {
	        //Join a game
	     }
		 
	}
	
	
	public static void main(String[] args) 
	{
        MainMenu menu = new MainMenu();
        
        menu.setTitle("Memory Puzzle");
        menu.setSize(600, 400); 
        menu.setResizable(false); 
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
	}
}
