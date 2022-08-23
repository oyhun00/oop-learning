package Observer.blog.after;

public class UserTable extends Subject {
  private String userId;

  public String getUserId() {
    return userId;
  }

  public void selectUserId(String userId) {
    this.userId = userId;
    notifyObservers();
  }
}
