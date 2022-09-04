package Composite.after;

public class TextFile extends Component {
  private String FileName;

  public TextFile(String FileName) {
    this.FileName = FileName;
  }

  public String getFile() {
    return FileName;
  }
}
