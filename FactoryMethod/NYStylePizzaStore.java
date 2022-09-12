package FactoryMethod;

public class NYStylePizzaStore extends PizzaStore {
  Pizza pizza;

  @Override
  Pizza createPizza(String type) {
    if (type.equals("Cheeze")) {
      pizza = new NYStyleCheesePizza();
    } else if (type.equals("Veggie")) {
      pizza = new NYStyleVeggiePizza();
    }

    return pizza;
  }
}
