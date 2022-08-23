package Decorator.Before;

public class Main {
  public static void main(String[] args) {
    RoadDisplay roadDisplay = new RoadDisplay();
    roadDisplay.draw();

    RoadDisplay roadWithDisplay = new RoadDisplayWithLane();
    roadWithDisplay.draw();

    RoadDisplay roadDisplayWithTraffic = new RoadDisplayWithTraffic();
    roadDisplayWithTraffic.draw();
  }
}
