package programmer.zama.now.data;

public class Avanza implements Car, IsMaintenance {

    public void drive() {
      System.out.println("Avanza drive");
    }

    public int getTier() {
    return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean IsMaintenance() {
        return false;
    }
}
