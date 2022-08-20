package Observer.after;

public class Main {
  public static void main(String[] args) {
    ScoreRecord scoreRecord = new ScoreRecord();

    DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
    DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
    MinMaxView minMaxView = new MinMaxView(scoreRecord);

    scoreRecord.attach(dataSheetView3);
    scoreRecord.attach(dataSheetView5);
    scoreRecord.attach(minMaxView);

    scoreRecord.addScore(10);
    scoreRecord.addScore(20);
    scoreRecord.addScore(30);
    scoreRecord.addScore(40);
    scoreRecord.addScore(50);
    scoreRecord.addScore(60);

    System.out.println("------------------------");

    scoreRecord.detach(dataSheetView5);
    scoreRecord.detach(minMaxView);

    scoreRecord.addScore(66);
    scoreRecord.addScore(77);
    scoreRecord.addScore(88);
    scoreRecord.addScore(99);
  }
}
