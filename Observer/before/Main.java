package Observer.before;

public class Main {
  public static void main(String[] args) {
    ScoreRecord scoreRecord = new ScoreRecord();

    DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);

    scoreRecord.setDataSheetView(dataSheetView);
    scoreRecord.addScore(10);
    scoreRecord.addScore(12);
    scoreRecord.addScore(14);
  }
}
