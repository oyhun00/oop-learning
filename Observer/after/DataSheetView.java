package Observer.after;

import java.util.List;

public class DataSheetView implements Observer {
  private int viewCount;
  private ScoreRecord scoreRecord;

  public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
    this.scoreRecord = scoreRecord;
    this.viewCount = viewCount;
  };

  private void displayScores(List<Integer> record, int viewCount) {
    System.out.println("List of " + viewCount + " Entries : ");

    for (int i = 0; i < viewCount && i < record.size(); i++) {
      System.out.println(record.get(i));
    }
    System.out.println(" ");
  };

  public void update() {
    List<Integer> record = scoreRecord.getScoreRecord();
    displayScores(record, viewCount);
  }
}
