package FactoryMethod;

public class ChicagoStylePizzaStore extends PizzaStore {
  Pizza pizza;

  @Override
  Pizza createPizza(String type) {
    if (type.equals("Cheeze")) {
      pizza = new ChicagoStyleCheesePizza();
    } else if (type.equals("Veggie")) {
      pizza = new ChicagoStyleVeggiePizza();
    }

    return pizza;
  }
}
