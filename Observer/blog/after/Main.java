package Observer.blog.after;

public class Main {
  public static void main(String[] args) {
    UserTable userTable = new UserTable();
    UserInfoView userInfoView = new UserInfoView(userTable);
    UserLogView userLogView = new UserLogView(userTable);

    userTable.subscribe(userInfoView);
    userTable.subscribe(userLogView);
    
    userTable.selectUserId("U001");

    userTable.unsubscribe(userLogView);

    userTable.selectUserId("U002");
  }
}
