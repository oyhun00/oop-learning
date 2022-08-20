package Observer.after;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
  private ScoreRecord scoreRecord;

  public MinMaxView(ScoreRecord scoreRecord) {
    this.scoreRecord = scoreRecord;
  };

  private void minMaxScores(List<Integer> record) {
    int min = Collections.min(record, null);
    int max = Collections.max(record, null);
    System.out.println("Min: " + min + ", max : " + max);
  };

  public void update() {
    List<Integer> record = scoreRecord.getScoreRecord();
    minMaxScores(record);  
  }
}
