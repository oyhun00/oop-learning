package Composite.before;

public class Main {
  public static void main(String[] args) {
    Folder root = new Folder("Root");
    TextFile memo = new TextFile("메모장 1");
    ExcelFile xlsx = new ExcelFile("엑셀 파일 1");

    root.addTextFile(memo);
    root.addExcelFile(xlsx);
    root.getFile();
  }
}
