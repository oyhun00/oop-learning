package FactoryMethod;

public abstract class PizzaStore {
  public void orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.box();
  }

  abstract Pizza createPizza(String type);
}
