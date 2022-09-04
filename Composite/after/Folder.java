package Composite.after;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
  private String FolderName;
  private List<Component> components = new ArrayList<>();

  public Folder(String FolderName) {
    this.FolderName = FolderName;
  }

  public void addFile(TextFile textFile) {
    this.components.add(textFile);
  }

  public List<Component> getChildren() {
    return components;
  }

  public String getFile() {
    return FolderName;
  }
}
