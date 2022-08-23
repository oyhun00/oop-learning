package Observer.blog.after;

public class UserLogView implements Observer {
  private UserTable userTable;

  public UserLogView(UserTable userTable) {
    this.userTable = userTable;
  }

  public void display(String userId) {
    System.out.println("================ " + userId + " User Log ===============");
    System.out.println("2022-08-21 12:45:50: ...");
    System.out.println("2022-08-19 09:21:00: ...");
    System.out.println("2022-08-17 06:01:21: ...");
    System.out.println("2022-08-16 14:58:44: ...");
    System.out.println("2022-08-15 16:22:07: ...");
    System.out.println("2022-08-14 20:11:54: ...");
    System.out.println("===============================================");
    System.out.println("");
  }

  public void update() {
    String userId = userTable.getUserId();
    display(userId);
  }
}
