package Factory;

public class SimplePizzaFactory {
  Pizza pizza;

  public Pizza createPizza(String type) {
    if (type.equals("Cheeze")) {
      pizza = new CheesePizza();
    } else if (type.equals("Veggie")) {
      pizza = new VeggiePizza();
    }

    return pizza;
  }
}
