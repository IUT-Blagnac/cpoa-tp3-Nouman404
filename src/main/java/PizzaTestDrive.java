import Pizzeria.Pizzeria;
import Pizzeria.PizzeriaBrest;
import Pizzeria.PizzeriaStrasbourg;
import pizza.Pizza;

public class PizzaTestDrive {
  public static void main(String[] args) {
    Pizzeria boutiqueBrest = new PizzeriaBrest();
    Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();

    Pizza pizza = boutiqueBrest.commanderPizza("cheese");
    System.out.println("JMB a commandé une " + pizza.getNom() + "\n");

    pizza = boutiqueStrasbourg.commanderPizza("cheese");
    System.out.println("JMI a commandé une " + pizza.getNom() + "\n");
  }
}