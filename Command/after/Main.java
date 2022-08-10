package Command.after;

public class Main {
  public static void main(String[] args) {
    Lamp theLamp = new Lamp();
    Command lampOnCommand = new LampOnCommand(theLamp);

    Button button1 = new Button(lampOnCommand);
    button1.pressed();

    Alarm alarm = new Alarm();
    Command alarmOnCommand = new AlarmStartCommand(alarm);

    Button button2 = new Button(alarmOnCommand);
    button2.pressed();

    button2.setCommand(lampOnCommand);
    button2.pressed();
  }
}
