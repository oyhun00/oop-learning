package Observer.blog.after;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  private List<Observer> observers = new ArrayList<Observer>();

  public void subscribe(Observer observer) {
    observers.add(observer);
  };

  public void unsubscribe(Observer observer) {
    observers.remove(observer);
  };

  public void notifyObservers() {
    for (Observer o:observers) {
      o.update();
    }
  };
}
