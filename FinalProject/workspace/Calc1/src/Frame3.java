import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Frame3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame4.class.getResource("Resources/Megumin.jpg")));
		setResizable(false);
		setTitle("\u041E\u0431 \u0430\u0432\u0442\u043E\u0440\u0435");
		setBounds(100, 100, 655, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(10, 10, 352, 331);
		contentPane.add(panel);
		
		ImageIcon authorIMG = new ImageIcon(Frame4.class.getResource("Resources/Img.jpg"));
		JLabel label = new JLabel(authorIMG);
	    panel.add(label).setBounds(26, 68, 314, 151);
	    
	    
	    JLabel lblNewLabel = new JLabel("\u0413\u0440\u0443\u043F\u043F\u0430 \u0418\u0442-3");
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblNewLabel.setBounds(368, 85, 269, 27);
	    contentPane.add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("\u0412\u0430\u0440\u0438\u0430\u043D\u0442 22");
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblNewLabel_1.setBounds(368, 125, 269, 27);
	    contentPane.add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_2 = new JLabel("03.05.2017");
	    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblNewLabel_2.setBounds(368, 165, 269, 27);
	    contentPane.add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_3 = new JLabel("\u0421\u0442\u0430\u0448\u043A\u0435\u0432\u0438\u0447 \u0421\u0435\u0440\u0433\u0435\u0439 \u0418\u0433\u043E\u0440\u0435\u0432\u0438\u0447");
	    lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblNewLabel_3.setBounds(368, 205, 269, 27);
	    contentPane.add(lblNewLabel_3);
	    
	    JButton button = new JButton("\u0417\u0430\u043A\u0440\u044B\u0442\u044C");
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		setVisible(false);
	    	}
	    });
	    button.setBounds(540, 316, 97, 25);
	    contentPane.add(button);
	}

}
