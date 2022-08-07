package State;

public class OFF implements State {
  public void on_button_pushed(Light light) {
    System.out.println("Light ON!");
    light.setState(new ON());
  }
  public void off_button_pushed(Light light) {
    System.out.println("반응 없음");
  }
}