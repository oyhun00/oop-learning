package FactoryMethod;

public class ChicagoStyleVeggiePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("Chicago Style Veggie Pizza Prepare");
  }

  @Override
  public void bake() {
    System.out.println("Chicago Style Veggie Pizza Bake");
  }

  @Override
  public void box() {
    System.out.println("Chicago Style Veggie Pizza Boxing");
  }
  
}
