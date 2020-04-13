package lab9;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PizzaBase implements Pizza{

	private BufferedImage img;
	
	public PizzaBase() {
		try {
			img = ImageIO.read(new File("pizza_base.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void bake (Graphics g) {
		g.drawImage(img, 300, 300, 300, 300, null);
	}
	@Override
	public int getPrice() {
		return 30;
	}
	@Override
	public String getIngredients() {
		return "PizzaBase";
	}
	
}
