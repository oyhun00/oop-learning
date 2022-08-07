package OopPractice.CheckPoint;

public class CheckPoint_35 {
  public abstract class HomeAppliancies {
    private Integer serialNo;
    private String manufacturer;
    private Integer year;

    public abstract void turnOn();
    public abstract void turnOff();
  }

  public class Washer extends HomeAppliancies {
    public void turnOn() {};
    public void turnOff() {};
  }

  public class Freezer extends HomeAppliancies {
    public void turnOn() {};
    public void turnOff() {};
  }

  public class DishWasher extends HomeAppliancies {
    public void turnOn() {};
    public void turnOff() {}; 
  }
}
