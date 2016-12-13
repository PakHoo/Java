package doctorUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class doctor_2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctor_2 window = new doctor_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public doctor_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("医生");
		frame.setBounds(100, 100, 580, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("病人:"+"                         ID:");
		lblNewLabel.setBounds(0, 0, 418, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("本次病情");
		btnNewButton.setBounds(0, 36, 123, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("开处方");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				doctorUI.chufang.main(null);
			}
		});
		btnNewButton_1.setBounds(0, 80, 123, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(138, 36, 379, 290);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton_3 = new JButton("保存");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("1");
			}
		});
		btnNewButton_3.setBounds(282, 350, 100, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("下一个");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				doctorUI.doctor_1.main(null);
			}
		});
		btnNewButton_4.setBounds(424, 350, 93, 29);
		frame.getContentPane().add(btnNewButton_4);
	}
}
