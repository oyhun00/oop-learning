package OopPractice.Q3;

public class Sample {
  public static void main(String[] args) {
    MineralCalculator cal = new MineralCalculator();
    cal.add(new Gold());
    cal.add(new Silver());
    cal.add(new Bronze());
    System.out.println(cal.getValue());
  }
}
