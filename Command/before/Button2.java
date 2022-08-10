package Command.before;

enum Mode { LAMP, ALARM }

public class Button2 {
  private Lamp theLamp;
  private Alarm alarm;
  private Mode mode;

  public Button2(Lamp theLamp, Alarm alarm) {
    this.theLamp = theLamp;
    this.alarm = alarm;
  };

  public void setMode(Mode mode) {
    this.mode = mode;
  }

  public void pressed() {
    if (mode.equals(Mode.LAMP)) {
      theLamp.turnOn();
    } else {
      alarm.start();
    }
  } 
}
