package Command.before;

public class Main2 {
  public static void main(String[] args) {
    Lamp theLamp = new Lamp();
    Alarm alarm = new Alarm();
    Button2 button = new Button2(theLamp, alarm);

    button.setMode(Mode.ALARM);
    button.pressed();

    button.setMode(Mode.LAMP);
    button.pressed();
  }
}
