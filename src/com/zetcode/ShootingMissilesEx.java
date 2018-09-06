package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ShootingMissilesEx extends JFrame {
	private static final long serialVersionUID = 1L;

	public ShootingMissilesEx() {
		initUI();
	}

	private void initUI() {
		add(new Board());

		setTitle("Shooting missiles");
		setSize(400, 300);

		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			ShootingMissilesEx ex = new ShootingMissilesEx();
			ex.setVisible(true);
		});
	}
}
