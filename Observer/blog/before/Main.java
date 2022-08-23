package Observer.blog.before;

public class Main {
  public static void main(String[] args) {
    UserTable userTable = new UserTable();
    UserInfoView userInfoView = new UserInfoView(userTable);
    UserLogView userLogView = new UserLogView(userTable);

    userTable.setUserInfoView(userInfoView);
    userTable.setUserLogView(userLogView);
    
    userTable.selectUserId("U001");
  }
}
