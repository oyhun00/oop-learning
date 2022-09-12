package Singleton.before;

public class Main {
  public static void main(String args[]) {
		ChocolateBoiler boiler = new ChocolateBoiler();
		// ChocolateBoiler boiler2 = new ChocolateBoiler();
		boiler.fill();
		boiler.fill();
		// boiler.boil();
		// boiler.drain();

		// will return the existing instance

	}
}
