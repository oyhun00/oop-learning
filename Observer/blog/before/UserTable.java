package Observer.blog.before;

public class UserTable {
  private String userId;
  private UserInfoView userInfoView;
  private UserLogView userLogView;

  public void setUserInfoView(UserInfoView userInfoView) {
    this.userInfoView = userInfoView;
  }

  public void setUserLogView(UserLogView userLogView) {
    this.userLogView = userLogView;
  }

  public String getUserId() {
    return userId;
  }

  public void selectUserId(String userId) {
    this.userId = userId;
    userInfoView.update();
    userLogView.update();
  }
}
