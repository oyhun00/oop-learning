package State;

public class ON implements State {
  public void on_button_pushed(Light light) {
    System.out.println("반응 없음");
  }
  public void off_button_pushed(Light light) {
    System.out.println("Light OFF!");
    light.setState(new OFF());
  }
}