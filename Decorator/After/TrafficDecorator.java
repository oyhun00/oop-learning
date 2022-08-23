package Decorator.After;

public class TrafficDecorator extends DisplayDecorator {
  public TrafficDecorator(Display decoratedDisplay) {
    super(decoratedDisplay);
  }

  public void draw() {
    super.draw();
    drawLane();
  }

  private void drawLane() {
    System.out.println("\tTraffic Display");
  }
}
