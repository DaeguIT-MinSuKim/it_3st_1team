package it_3st_1team.ui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Jf_InsertBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jf_InsertBook frame = new Jf_InsertBook();
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
	public Jf_InsertBook() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("도서 추가");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(10, 3, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("도서명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblIsbn = new JLabel("저자");
		lblIsbn.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblIsbn);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_7.add(textField_1);
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_1 = new JLabel("출판사");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_9.add(textField_2);
		
		JPanel panel_10 = new JPanel();
		panel_9.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_2.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_2 = new JLabel("출판년도");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_11.add(textField_3);
		
		JPanel panel_12 = new JPanel();
		panel_11.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_2.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblSibn = new JLabel("isbn");
		lblSibn.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblSibn);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_13.add(textField_4);
		
		JPanel panel_14 = new JPanel();
		panel_13.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_2.add(panel_15);
		panel_15.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_4 = new JLabel("도서명");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_15.add(textField_5);
		
		JPanel panel_16 = new JPanel();
		panel_15.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_2.add(panel_17);
		panel_17.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label = new JLabel("분류");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(label);
		
		JComboBox comboBox = new JComboBox();
		panel_17.add(comboBox);
		
		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("추가");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		panel_1.add(btnNewButton_1);
		
	}

}
