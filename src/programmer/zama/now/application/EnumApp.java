package programmer.zama.now.application;

import programmer.zama.now.data.Customer;
import programmer.zama.now.data.Level;

// Belajar Enum Class
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.Premium);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("Premium");
        System.out.println(level);

        // check jumlah enumnya ada berapa
        System.out.println("Print Level");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
