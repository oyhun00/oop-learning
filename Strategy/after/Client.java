package Strategy.after;

public class Client {
  public static void main(String[] args) {
    Robot taekwonV = new TaekwonV("Taekwon V");
    Robot atom = new Atom("Atom");

    taekwonV.setAttackStrategy(new PuchStrategy());
    taekwonV.setMovingStrategy(new FlyingStrategy());

    atom.setAttackStrategy(new MissileStrategy());
    atom.setMovingStrategy(new WalkingStrategy());

    System.out.println("My name is " + taekwonV.getName());
    taekwonV.attack();
    taekwonV.move();

    System.out.println();
    System.out.println("My name is " + atom.getName());
    atom.attack();
    atom.move();
  }
}
