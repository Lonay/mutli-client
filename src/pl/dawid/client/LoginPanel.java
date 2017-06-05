package pl.dawid.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {

	JButton startButton;
	JTextField loginField;

	public LoginPanel() {
		BorderLayout layout = new BorderLayout(10, 10);
		//setLayout(layout);
		startButton = new JButton("Start");
		loginField = new JTextField();
		loginField.setPreferredSize(new Dimension(100, 25));
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(loginField);
		panel.add(startButton);
		add(panel);
		//add(startButton, BorderLayout.CENTER);
	}

}
