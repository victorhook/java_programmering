package game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

class StyledBtn extends JButton implements MouseListener {
		
	private GameEngine engine;
	private String text;
	
		public StyledBtn(String text, GameEngine engine) {
			super(text);
			this.engine = engine;
			this.text = text;
			
			setPreferredSize(new Dimension(400, 80));
			setFont(new Font("Courier", Font.BOLD, 25));
			setFocusPainted(false);
			setForeground(MainGame.ORANGE);
			setBackground(MainGame.GRAY);
			setBorder(new LineBorder(Color.black, 3));
			addMouseListener(this);
		}
		
		public StyledBtn(String text, GameEngine engine, Dimension d) {
			super(text);
			this.engine = engine;
			this.text = text;
			
			setPreferredSize(d);
			setFont(new Font("Courier", Font.BOLD, 25));
			setFocusPainted(false);
			setForeground(MainGame.ORANGE);
			setBackground(MainGame.GRAY);
			setBorder(new LineBorder(Color.black, 3));
			addMouseListener(this);
		}
		
		@Override
		public void mouseClicked(MouseEvent event) {
			engine.buttonCallback(text);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			setBackground(MainGame.GRAY2);
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			setBackground(MainGame.GRAY);
		}

		public void mousePressed(MouseEvent arg0) {
			setBackground(MainGame.GRAY2);
		}
		public void mouseReleased(MouseEvent arg0) {}

	}