package com.zetcode;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MovingSprite extends JFrame {
	private static final long serialVersionUID = 1L;

	public MovingSprite() {
		initUI();
	}

	private void initUI() {
		add(new Board());

		setTitle("MovingSprite");
		setSize(400, 300);

		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			MovingSprite ex = new MovingSprite();
			ex.setVisible(true);
		});
	}
}
