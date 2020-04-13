package lab9;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public Pizza p;

	public MyPanel() {
		p = new Tomato(new Olive(new Mushroom(new Corn(new Salami(new PizzaBase())))));
		System.out.println(p.getIngredients());
		System.out.println(p.getPrice());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		p.bake(g);
		//repaint();
	}

	public String getP() {
		return p.getIngredients();
	}

	public void setP(Pizza p) {
		this.p = p;
	}
}
