package pl.dawid.client;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Board extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1584723970633102624L;
	private final int SIZE = 10;
	Tile[][] fields;

	public Board(ImageIcon icon) {
		
		GridLayout boardLayout = new GridLayout(SIZE, SIZE);
		//boardLayout.setHgap(1);
		//boardLayout.setVgap(1);
		setLayout(boardLayout);
		
		
		
		
		createBoard(icon);
	}

	void createBoard(ImageIcon icon) {
		fields = new Tile[SIZE][SIZE];
		Border border = new LineBorder(Color.BLUE, 1);
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {

				fields[i][j] = new Tile(icon);
				fields[i][j].setBorder(border);
				add(fields[i][j]);

			}
		}
	}

	public int getFieldValue(int i, int j) {
		// TODO Auto-generated method stub
		return Integer.parseInt(fields[i][j].getText());
	}

}
