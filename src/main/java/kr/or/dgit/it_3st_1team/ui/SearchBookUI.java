package kr.or.dgit.it_3st_1team.ui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SearchBookUI extends JPanel {

	public SearchBookUI() {

		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(0, 128, 128));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("도서검색");
		lblNewLabel.setBounds(196, 5, 57, 15);
		add(lblNewLabel);
	}

}
