package lab9;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mushroom extends PizzaIngredient{

	private BufferedImage img;
	
	public Mushroom(Pizza pizza) {
		super(pizza);
		try {
			img = ImageIO.read(new File("mushroom.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void bake(Graphics g) {
		// TODO Auto-generated method stub
		super.bake(g);
		addMushroom(g);
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+5;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + " "+"Mushroom";
	}
	
	public void addMushroom(Graphics g) {
		g.drawImage(img, 300, 300, 300, 300, null);
	}

}
