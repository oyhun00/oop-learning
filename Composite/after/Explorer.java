package Composite.after;

public class Explorer {
  public Explorer(Component components) {
    // System.out.println(components.getClass().getName());
    System.out.println(components.getClass().getName() + "|" + components.getFile());
    if(components instanceof Folder) {
      for(Component c : ((Folder)components).getChildren()) {
        System.out.println(c.getFile());
      }
    }
  }
}
