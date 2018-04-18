package uni.formas.frame;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

import uni.formas.Forma;

public class JanelaFormas extends JFrame {

	private ArrayList<Forma> formas;
	
	public JanelaFormas(int largura, int altura) {
		formas = new ArrayList<Forma>();
		setSize(largura, altura);
		setResizable(false);

		setContentPane(new JPanel() {
			@Override
			protected void paintComponent(java.awt.Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				for(Forma f : formas) {
					f.print(g2);
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics2D g) {


	}
	
	public void addForma(Forma f) {
		formas.add(f);
	}
}
