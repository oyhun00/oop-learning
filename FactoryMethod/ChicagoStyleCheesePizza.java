package FactoryMethod;

public class ChicagoStyleCheesePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("Chicago Style CheesePizza Prepare");
  }

  @Override
  public void bake() {
    System.out.println("Chicago Style CheesePizza Bake");
  }

  @Override
  public void box() {
    System.out.println("Chicago Style CheesePizza Boxing");
  }
  
}
