package FactoryMethod;

public class NYStyleVeggiePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("NY Style Veggie Pizza Prepare");
  }

  @Override
  public void bake() {
    System.out.println("NY Style Veggie Pizza Bake");
  }

  @Override
  public void box() {
    System.out.println("NY Style Veggie Pizza Boxing");
  }
  
}
