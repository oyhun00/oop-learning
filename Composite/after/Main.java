package Composite.after;

public class Main {
  public static void main(String[] args) {
    Folder
    root = new Folder("root"),
    home = new Folder("home"),
    mesung = new Folder("mesung"),
    music = new Folder("music"),
    picture = new Folder("picture"),
    doc = new Folder("doc"),
    usr = new Folder("usr");
  
    TextFile
    track1 = new TextFile("track1"),
    track2 = new TextFile("track2"),
  
    root.addFile(track1);
  
    show(root);
  }
  private static void show(Component components) {
    // System.out.println(components.getClass().getName());
    System.out.println(components.getClass().getName() + "|" + components.getFile());
    if(components instanceof Folder) {
      for(Component c : ((Folder)components).getChildren()) {
        System.out.println(c.getFile());
      }
    }
  }
}
