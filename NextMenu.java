import javax.swing.*;
import javax.swing.border.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class NextMenu extends JFrame 
{

	private JPanel contentPane;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					NextMenu frame = new NextMenu();
					frame.setTitle("Memory Puzzle");
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NextMenu() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setContentPane(contentPane);
		
		Dimension btnsize = new Dimension(100, 30);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel_1.setBorder(new TitledBorder(null, "Pick a board size!", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Value1", "Value2", "Value3"}));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Allow \"Join Game In-Progress\"?");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		
		JButton btnCreateGame = new JButton("Create Game");
		
		JButton btnBack = new JButton("Back");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(btnBack)
							.addGap(54)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(btnCreateGame))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(98)
							.addComponent(rdbtnNewRadioButton)))
					.addContainerGap(106, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(63)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(42))
							.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCreateGame)
								.addGap(51)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(84)
							.addComponent(btnBack)))
					.addGap(42)
					.addComponent(rdbtnNewRadioButton)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		//JLabel lblPickYourPreferred = new JLabel("Pick your preferred board size, hit 'Create Game' and get started!");
		//contentPane.add(lblPickYourPreferred, BorderLayout.NORTH);
	}
}
