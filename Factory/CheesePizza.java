package Factory;

public class CheesePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("CheezePizza Prepare");
  }

  @Override
  public void bake() {
    System.out.println("CheezePizza Bake");
  }

  @Override
  public void box() {
    System.out.println("CheezePizza Boxing");
  }
  
}
