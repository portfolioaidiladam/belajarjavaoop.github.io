package programmer.zama.now.application;

import programmer.zama.now.data.HelloWorld;

// belajar Anonymous Class
public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }


            public void sayHello(String name) {
                System.out.println("Hello"+name);
            }
        }; HelloWorld indonesia = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }


            public void sayHello(String name) {
                System.out.println("Hello"+name);
            }
        };

        english.sayHello();
        english.sayHello("Aidil");

        indonesia.sayHello();
        indonesia.sayHello("Adam");

    }
}
