package Command.before;

public class Button {
  private Lamp lamp;

  public Button(Lamp theLamp) {
    this.lamp = theLamp;
  };

  public void pressed() {
    lamp.turnOn();
  };
}
