package Factory;

public class Main {
  public static void main(String[] args) {
    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

    pizzaStore.orderPizza("Cheeze");
  }
}
