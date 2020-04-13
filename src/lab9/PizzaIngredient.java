package lab9;

import java.awt.Graphics;

public class PizzaIngredient implements Pizza{

	protected Pizza pizza;
	
	public PizzaIngredient(Pizza pizza) {
		this.pizza = pizza;
		
	}
	
	@Override
	public void bake(Graphics g) {
		// TODO Auto-generated method stub
		pizza.bake(g);
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice();
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return pizza.getIngredients();
	}

}
