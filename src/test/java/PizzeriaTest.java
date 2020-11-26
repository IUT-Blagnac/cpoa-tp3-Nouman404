import static org.junit.Assert.*;
import org.junit.Test;

import Pizzeria.Pizzeria;
import Pizzeria.PizzeriaBrest;
import Pizzeria.PizzeriaStrasbourg;
import pizza.Pizza;
import pizza.PizzaFromage;
import pizza.PizzaFromageStyleBrest;
import pizza.PizzaFromageStyleStrasbourg;
import pizza.PizzaGrecque;
import pizza.PizzaGrecqueStyleBrest;
import pizza.PizzaGrecqueStyleStrasbourg;
import pizza.PizzaPoivrons;
import pizza.PizzaPoivronsStyleBrest;
import pizza.PizzaPoivronsStyleStrasbourg;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = PizzeriaBrest.instanciate();
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void pizzaPoivronBrestDifferentOfStrasbourg() {
    	PizzaPoivrons pizPoivS = new PizzaPoivronsStyleStrasbourg();
    	PizzaPoivrons pizPoivB = new PizzaPoivronsStyleBrest();
    	assertNotEquals("Two ordered are different", pizPoivB, pizPoivS);
    }
    
    @Test
    public void pizzaFromageBrestDifferentOfStrasbourg() {
    	PizzaFromage pizFromS = new PizzaFromageStyleStrasbourg();
    	PizzaFromage pizFromB = new PizzaFromageStyleBrest();
    	assertNotEquals("Two ordered are different", pizFromS, pizFromB);
    }
    
    @Test
    public void pizzaGreekBrestDifferentOfStrasbourg() {
    	PizzaGrecque pizGreS = new PizzaGrecqueStyleStrasbourg();
    	PizzaGrecque pizGreB = new PizzaGrecqueStyleBrest();
    	assertNotEquals("Two ordered are different", pizGreS, pizGreB);
    }

    @Test
    public void prepCheeseDifferentInStrasbourgAndBrest() {
    	Pizzeria boutiqueBrest = PizzeriaBrest.instanciate();
        Pizzeria boutiqueStrasbourg = PizzeriaStrasbourg.instanciate();
    	Pizza pizzaS = boutiqueStrasbourg.commanderPizza("cheese");
    	Pizza pizzaB = boutiqueBrest.commanderPizza("cheese");
    	assertNotEquals("Two preparation are different", pizzaS, pizzaB);
    }
    
    @Test
    public void prepPepperDifferentInStrasbourgAndBrest() {
    	Pizzeria boutiqueBrest = PizzeriaBrest.instanciate();
        Pizzeria boutiqueStrasbourg = PizzeriaStrasbourg.instanciate();
    	Pizza pizzaS = boutiqueStrasbourg.commanderPizza("pepper");
    	Pizza pizzaB = boutiqueBrest.commanderPizza("pepper");
    	assertNotEquals("Two preparation are different", pizzaS, pizzaB);
    }
    
    @Test
    public void prepGreekDifferentInStrasbourgAndBrest() {
    	Pizzeria boutiqueBrest = PizzeriaBrest.instanciate();
        Pizzeria boutiqueStrasbourg = PizzeriaStrasbourg.instanciate();
    	Pizza pizzaS = boutiqueStrasbourg.commanderPizza("greek");
    	Pizza pizzaB = boutiqueBrest.commanderPizza("greek");
    	assertNotEquals("Two preparation are different", pizzaS, pizzaB);
    }
    
    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = PizzeriaBrest.instanciate();
        Pizzeria boutiqueStrasbourg = PizzeriaStrasbourg.instanciate();
        Pizza miam1 = boutiqueBrest.commanderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
    
    @Test
    public void testSingletonStrasbourg() {
        Pizzeria boutiqueStrasbourg1 = PizzeriaStrasbourg.instanciate();
        Pizzeria boutiqueStrasbourg2 = PizzeriaStrasbourg.instanciate();
        assertEquals("Two instance Pizzas Are Different",boutiqueStrasbourg1,boutiqueStrasbourg2);
    }
}