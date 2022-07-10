package OopPractice.Q1;

public class Calculator {
  int value;

  Calculator() {
    this.value = 0;
  }

  void add(int val) {
    this.value += val;
  }

  void minus(int val) {
    this.value -= val;
  }

  int getValue() {
    return this.value;
  }
}
