import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Campeones campeones = new Campeones();
        System.out.println(campeones.ganoEnAño(2010));
        System.out.println(campeones.ganoEnAño(2011));
        System.out.println(campeones.ganoPais("Brasil"));
        System.out.println(campeones.ganoPais("Holanda"));
        
        
    }
}
