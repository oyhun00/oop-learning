package Factory;

public class PizzaStore {
  SimplePizzaFactory simplePizzaFactory;

  public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
    this.simplePizzaFactory = simplePizzaFactory;
  }

  public void orderPizza(String type) {
    Pizza pizza;

    pizza = simplePizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.box();
  }
}
