package lab9;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Salami extends PizzaIngredient {

	private BufferedImage img;
	public Salami(Pizza pizza) {
		super(pizza);
		try {
			img = ImageIO.read(new File("salami.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void bake(Graphics g) {
		// TODO Auto-generated method stub
		super.bake(g);
		addSalami(g);
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+15;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + " "+"Salami";
	}
	
	public void addSalami(Graphics g) {
		g.drawImage(img, 300, 300, 300, 300, null);
	}

}
