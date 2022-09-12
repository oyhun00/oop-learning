package FactoryMethod;

public class Main {
  public static void main(String[] args) {
    PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
    chicagoStylePizzaStore.orderPizza("Cheeze");
  }
}
