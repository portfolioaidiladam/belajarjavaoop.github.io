package programmer.zama.now.data;
// Belajar Enum Class
public enum Level {
    Standard ("Standard Level"),
    Premium("Premium Level"),
    VIP ("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
