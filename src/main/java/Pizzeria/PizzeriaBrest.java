package Pizzeria;

import pizza.Pizza;
import pizza.PizzaFromageStyleBrest;
import pizza.PizzaGrecqueStyleBrest;
import pizza.PizzaPoivronsStyleBrest;

public class PizzeriaBrest extends Pizzeria {
	private static PizzeriaBrest pizzeriaB= new PizzeriaBrest();
	
	private PizzeriaBrest() {
		
	}
	
	public static PizzeriaBrest instanciate() {
		return pizzeriaB;
	}
	
	
	protected Pizza creerPizza(String type) {
		switch (type) {
		case "cheese": 	
			return new PizzaFromageStyleBrest();
		case "greek":
			return new PizzaGrecqueStyleBrest();
		case "pepper":
			return new PizzaPoivronsStyleBrest();
		default:
			return null;
		}
	}
}
