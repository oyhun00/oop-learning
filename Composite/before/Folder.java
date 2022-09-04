package Composite.before;

import java.util.ArrayList;
import java.util.List;

public class Folder {
  private String FolderName;
  private List<String> textFile = new ArrayList<>();
  private List<String> excelFile = new ArrayList<>();

  public Folder(String FolderName) {
    this.FolderName = FolderName;
  }

  public void addTextFile(TextFile textFile) {
    this.textFile.add(textFile.getFile());
  }

  public void addExcelFile(ExcelFile excelFile) {
    this.excelFile.add(excelFile.getFile());
  }

  public void getFile() {
    System.out.println("--- " + FolderName + "---");

    for(String textFile : textFile) {
      System.out.println(textFile);
    }
    
    for(String excelFile : excelFile) {
      System.out.println(excelFile);
    }
  }

}
