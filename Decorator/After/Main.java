package Decorator.After;

public class Main {
  public static void main(String[] args) {
    Display roadDisplay = new RoadDisplay();
    roadDisplay.draw();

    Display roadWithLaneDisplay = new LaneDecorator(new RoadDisplay());
    roadWithLaneDisplay.draw();

    Display roadWithTrafficDisplay = new TrafficDecorator(new RoadDisplay());
    roadWithTrafficDisplay.draw();

    Display roadWithLaneAndTrafficDisplay = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
    roadWithLaneAndTrafficDisplay.draw();
  }
}
