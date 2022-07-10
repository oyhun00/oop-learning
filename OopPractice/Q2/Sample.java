package OopPractice.Q2;

public class Sample {
  public static void main(String[] args) {
    MaxLimitCalculator cal = new MaxLimitCalculator();
    cal.add(50);
    cal.add(60);

    System.out.println(cal.getValue());
  }
}
