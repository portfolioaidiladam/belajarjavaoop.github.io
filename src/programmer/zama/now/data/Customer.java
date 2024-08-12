package programmer.zama.now.data;
// Belajar Enum Class
public class Customer {
    private String Name;

    private Level level;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
