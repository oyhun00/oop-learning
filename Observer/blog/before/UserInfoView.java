package Observer.blog.before;

public class UserInfoView {
  private UserTable userTable;

  public UserInfoView(UserTable userTable) {
    this.userTable = userTable;
  }

  public void display(String userId) {
    System.out.println("================ " + userId + " User Info ===============");
    System.out.println("User ID: ...");
    System.out.println("User Name: ...");
    System.out.println("===============================================");
    System.out.println("");
  }

  public void update() {
    String userId = userTable.getUserId();
    display(userId);
  }
}
