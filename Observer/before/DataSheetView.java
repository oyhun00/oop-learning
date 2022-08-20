package Observer.before;
import java.util.List;

public class DataSheetView {
  private int viewCount;
  private ScoreRecord scoreRecord;

  public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
    this.viewCount = viewCount;
    this.scoreRecord = scoreRecord;
  }

  public void displayScores(List<Integer> record, int viewCount) {
    System.out.println("List of " + viewCount + " entries: ");

    for(int i = 0; i < viewCount && i < record.size(); i++) {
      System.out.println(record.get(i) + " ");
    }
    System.out.println(" ");
  }

  public void update() {
    List<Integer> record = scoreRecord.getScoreRecord();
    displayScores(record, viewCount);
  }
}
