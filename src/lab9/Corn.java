package lab9;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Corn extends PizzaIngredient{

	
	private BufferedImage img;
	
	public Corn(Pizza pizza) {
		
		super(pizza);
		try {
			img = ImageIO.read(new File("corn.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void bake(Graphics g) {
		// TODO Auto-generated method stub
		super.bake(g);
		addCorn(g);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+1;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + " "+ "Corn";
	}
	
	private void addCorn(Graphics g) {
		g.drawImage(img, 300, 300, 300, 300, null);
	}

}
