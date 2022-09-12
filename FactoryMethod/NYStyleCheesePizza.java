package FactoryMethod;

public class NYStyleCheesePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("NY Style CheesePizza Prepare");
  }

  @Override
  public void bake() {
    System.out.println("NY Style CheesePizza Bake");
  }

  @Override
  public void box() {
    System.out.println("NY Style CheesePizza Boxing");
  }
  
}
