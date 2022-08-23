package Decorator.Before;

public class RoadDisplayWithTraffic extends RoadDisplay {
  public void draw() {
    super.draw();
    drawTraffic();
  }

  private void drawTraffic() {
    System.out.println("==========================");
    System.out.println("Traffic Display");
    System.out.println("==========================");
    System.out.println("");
  }
}
