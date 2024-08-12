public class PersonApp {

    public static void main(String[] args) {

        Person person1 = new Person("Aidil","Jakarta Timur");
        /* ini sebenernya ndak dibutuhin lagi karena sudah dijadiin construktor
        person1.name = "Aidil";
        person1.address = "Jakarta Timur";*/
        // person1.country ="Amerika"; // Error

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello( "Budi");

        Person person2 = new Person("Akbar");
        //person2.name = "Akbar"; ini sebenernya ndak dibutuhin lagi karena sudah dijadiin construktor
        person2.address = "Jakarta Timur";
        person2.sayHello("Jaya");

        Person person3;
        person3 = new Person();
        person3.name = "Adam";
        person3.address = "Jakarta Timur";
        person3.sayHello("budi");



    }

}
