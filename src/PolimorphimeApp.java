public class PolimorphimeApp {
    public static void main(String[] args) {

        Employee employee =new Employee("Aidil");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Agust");

        employee = new VicePresident("Eko");
        employee.sayHello("Adam");

        sayHello(new Employee("Aidil"));
        sayHello(new Manager("Eko"));
        sayHello(new VicePresident("Agust"));
    }

    static void sayHello (Employee employee){
        // proses pengecekan dan konfersi tipe data cast di tipe data primitif
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if  (employee instanceof  Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }

    }
}
