package Factory;

public class VeggiePizza implements Pizza {
  @Override
  public void prepare() {
    System.out.println("VeggiePizza Prepare");
  }

  @Override
  public void bake() {
    System.out.println("VeggiePizza Bake");
  }

  @Override
  public void box() {
    System.out.println("VeggiePizza Boxing");
  }
  
}
