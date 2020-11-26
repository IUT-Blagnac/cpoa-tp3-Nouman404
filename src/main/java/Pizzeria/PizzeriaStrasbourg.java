package Pizzeria;

import pizza.Pizza;
import pizza.PizzaFromageStyleStrasbourg;
import pizza.PizzaGrecqueStyleStrasbourg;
import pizza.PizzaPoivronsStyleStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria {

	private static PizzeriaStrasbourg pizzeriaS= new PizzeriaStrasbourg();
	
	private PizzeriaStrasbourg() {
		
	}
	
	public static PizzeriaStrasbourg instanciate() {
		return pizzeriaS;
	}
	
	protected Pizza creerPizza(String type) {
		switch (type) {
		case "cheese":
			return new PizzaFromageStyleStrasbourg();
		case "greek":
			return new PizzaGrecqueStyleStrasbourg();
		case "pepper":
			return new PizzaPoivronsStyleStrasbourg();
		default:
			return null;
		}
	}
}
