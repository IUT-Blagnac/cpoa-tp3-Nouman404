package Pizzeria;

import pizza.Pizza;
import pizza.PizzaFromage;
import pizza.PizzaGrecque;
import pizza.PizzaPoivrons;

/**
 * @author HAMDI (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {

        /**
         * @param type
         * @return a Pizza object according to the type
         */
		public Pizza commanderPizza(String type) {

		//SimpleFabriqueDePizzas fabrique = new SimpleFabriqueDePizzas();
	 
		//Pizza pizza = fabrique.creerPizza(type);
		
		Pizza pizza = creerPizza(type);

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
		}
		
		protected abstract Pizza creerPizza(String type);
}