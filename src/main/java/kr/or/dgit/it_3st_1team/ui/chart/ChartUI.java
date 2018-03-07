package kr.or.dgit.it_3st_1team.ui.chart;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ChartUI extends JPanel {

	public ChartUI() {

		initComponents();
	}
	private void initComponents() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
	}

}
