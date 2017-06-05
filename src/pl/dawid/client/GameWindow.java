package pl.dawid.client;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ImageIcon crossIcon;
	ImageIcon dotIcon;
	ImageIcon emptyIcon;

	public GameWindow() {
		super("Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout layout = new GridLayout(1, 0);
		layout.setHgap(25);
		setLayout(layout);
		if(!loadImages()){
			JOptionPane.showMessageDialog(this, "Nie mo¿na za³adowaæ gry");
			System.exit(0);
		}
		Board playerBoard = new Board(emptyIcon);
		add(playerBoard);
		//Board enemyBoard = new Board(emptyIcon);	
		//add(enemyBoard);
		LoginPanel loginPanel = new LoginPanel();
		add(loginPanel);
		pack();
		setVisible(true);
	}

	boolean loadImages() {
		
		BufferedImage crossImage;
		BufferedImage dotImage;
		BufferedImage emptyImage;
		File file= new File("images\\x.png");
		try {
			crossImage = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		file = new File("images\\dot.png");
		try {
			dotImage = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		file = new File("images\\white.png");
		
		try {
			emptyImage = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		crossIcon = new ImageIcon(crossImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		dotIcon = new ImageIcon(dotImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		emptyIcon= new ImageIcon(emptyImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		return true;
	}
}