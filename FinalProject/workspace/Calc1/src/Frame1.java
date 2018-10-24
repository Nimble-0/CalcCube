import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;


public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField cubeLength;
	private JTextField cubeVolume;
	private JTextField cubeArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame1 = new Frame1();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame1() {
		setResizable(false);
		setForeground(new Color(51, 204, 255));
		setBackground(new Color(204, 204, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame4.class.getResource("Resources/Megumin.jpg")));
		
		
		setTitle("\u041A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LabelCubeLength = new JLabel("\u0414\u043B\u0438\u043D\u0430 \u0440\u0435\u0431\u0440\u0430 \u043A\u0443\u0431\u0430 (H), \u043C:");
		LabelCubeLength.setBounds(12, 16, 152, 16);
		contentPane.add(LabelCubeLength);
		
		cubeLength = new JTextField();
		cubeLength.setText("0");
		cubeLength.setBounds(168, 13, 89, 22);
		contentPane.add(cubeLength);
		cubeLength.setColumns(10);
		
		JLabel LabelCubeVolume = new JLabel("\u041E\u0431\u044A\u0435\u043C \u043A\u0443\u0431\u0430 (V), \u043C^3:");
		LabelCubeVolume.setBounds(12, 180, 127, 16);
		contentPane.add(LabelCubeVolume);
		
		JLabel LabelCubeArea = new JLabel("\u041F\u043B\u043E\u0449\u0430\u0434\u044C \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0438 \u043A\u0443\u0431\u0430 (S), \u043C^2:");
		LabelCubeArea.setBounds(12, 212, 230, 16);
		contentPane.add(LabelCubeArea);
		
		cubeVolume = new JTextField();
		cubeVolume.setEditable(false);
		cubeVolume.setBounds(236, 175, 160, 22);
		contentPane.add(cubeVolume);
		cubeVolume.setColumns(10);
		
		cubeArea = new JTextField();
		cubeArea.setEditable(false);
		cubeArea.setBounds(236, 207, 160, 22);
		contentPane.add(cubeArea);
		cubeArea.setColumns(10);
		
		cubeLength.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      char d = e.getKeyChar();
			      if ( ((c < '0') || (c > '9'))&& (d != KeyEvent.VK_PERIOD)) {
			         e.consume();  // ������� ��������� ����� � ������
			      }
			      if(cubeLength.getText().length()>=10) {  
			    	   e.consume(); 	   
			      }
			      
			   }
			   });
	
		
		JButton button = new JButton("\u041D\u0430\u0439\u0442\u0438");
		
		 
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {					
		double DoubleCubeLength = 0; 
		
		if((cubeLength.getText().length()<=0)) {  
			DoubleCubeLength = Double.valueOf("0");
			cubeLength.setText("0");
	      }  
		else
			try{
		DoubleCubeLength = Double.valueOf(cubeLength.getText());	
		cubeVolume.setText((DoubleCubeLength*DoubleCubeLength*DoubleCubeLength)+"");
		cubeArea.setText((DoubleCubeLength*DoubleCubeLength*6)+"");
			}
		catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "������. ������� ���������� ��������.");
	        } 
			}
		});
		button.setBounds(12, 142, 97, 25);
		contentPane.add(button);
		
		JButton buttonExit = new JButton("\u0412\u044B\u0445\u043E\u0434");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);	
			}
		});
		buttonExit.setBounds(416, 204, 154, 25);
		contentPane.add(buttonExit);
		
		JButton AuthorButton = new JButton("\u041E\u0431 \u0430\u0432\u0442\u043E\u0440\u0435");
		AuthorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3 form3 = new Frame3();              
				form3.setVisible(true);
			}
		});
		AuthorButton.setBounds(449, 51, 121, 25);
		contentPane.add(AuthorButton);
		
		JButton AboutButton = new JButton("\u041E \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0435");
		AboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame2 form2 = new Frame2();              
				form2.setVisible(true);
			}
		});
		AboutButton.setBounds(449, 13, 121, 25);
		contentPane.add(AboutButton);
		
		JButton btnNewButton = new JButton("\u041A \u043D\u0430\u0447\u0430\u043B\u044C\u043D\u043E\u043C\u0443 \u043E\u043A\u043D\u0443");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame4 form4 = new Frame4();              
				form4.setVisible(true);  
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(416, 176, 154, 25);
		contentPane.add(btnNewButton);
			
		
		
	}
}
