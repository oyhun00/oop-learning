package Singleton.before;

public class ChocolateBoiler {
  private boolean empty;
	private boolean boiled;
  
	public ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("action fill");
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
			System.out.println("action drain");
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
			System.out.println("action boil");
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
