package OopPractice.Q2;

public class MaxLimitCalculator extends Calculator {
  void add(int val) {
    this.value += val;

    if(this.value > 100) {
      this.value = 100;
    }
  }
}
