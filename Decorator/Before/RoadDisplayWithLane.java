package Decorator.Before;

public class RoadDisplayWithLane extends RoadDisplay {
  public void draw() {
    super.draw();
    drawLane();
  }

  private void drawLane() {
    System.out.println("==========================");
    System.out.println("Lane Display");
    System.out.println("==========================");
    System.out.println("");
  }
}
