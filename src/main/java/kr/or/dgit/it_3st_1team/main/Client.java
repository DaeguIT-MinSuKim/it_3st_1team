package kr.or.dgit.it_3st_1team.main;

import java.awt.EventQueue;

import kr.or.dgit.it_3st_1team.ui.StartUI;

public class Client {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUI frame = new StartUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
