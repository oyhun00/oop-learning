package Observer.before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
  private List<Integer> scores = new ArrayList<Integer>();
  private DataSheetView dataSheetView;
  
  public void setDataSheetView(DataSheetView dataSheetView) {
    this.dataSheetView = dataSheetView;
  }

  public List<Integer> getScoreRecord() {
    return scores;
  }

  public void addScore(int score) {
    scores.add(score);
    dataSheetView.update();
  }
}
