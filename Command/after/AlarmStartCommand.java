package Command.after;

public class AlarmStartCommand implements Command {
  private Alarm alarm;

  public AlarmStartCommand(Alarm alarm) {
    this.alarm = alarm;
  }

  public void execute() {
    alarm.start();
  }
}
