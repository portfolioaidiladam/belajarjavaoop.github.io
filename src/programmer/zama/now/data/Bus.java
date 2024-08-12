package programmer.zama.now.data;

public class Bus implements Car{
    @Override
    public void drive() {
        System.out.println("Bus drive");
    }


    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    @Override
    public boolean IsMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
