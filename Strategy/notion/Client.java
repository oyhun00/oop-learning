package Strategy.notion;

public class Client {
  public static void main(String[] args) {
    Robot taekwonV = new TaekwonV("Taekwon V");
    Robot atom = new Atom("Atom");

    System.out.println("My name is " + taekwonV.getName());
    taekwonV.attack();
    taekwonV.move();

    System.out.println();
    System.out.println("My name is " + atom.getName());
    atom.attack();
    atom.move();
  }
}
