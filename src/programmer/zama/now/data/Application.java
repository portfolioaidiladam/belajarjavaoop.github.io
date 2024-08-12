package programmer.zama.now.data;
// belajar Static Keyword (Static Blok)
public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Menggakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
