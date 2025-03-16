import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Super = Keyword refers to the superclass (parent) of an object
        //         very similar to the "this" keyword

//        Hero hero = new Hero("Femi", 38, "Super Strength");
//        Hero her1 = new Hero("Oluwafemi", 39, "Super Strength");
//
//        hero.age = 40;
//        hero.power = "Super Speed";
//        hero.name = "Samantha";
//        System.out.println(hero.name);
//
//        System.out.println(her1.toString());

        // Abstract Keyword = abstract classes cannot be instantiated, but they can have a subclass
        //                     abstract methods are declared without an implementation
//        Vehicle vehicle = new Vehicle();
//        Car car = new Car();
//        car.go();
//        car.stop();
        // Encapsulation = attributes of a class will be hidden or private, and can only be accessed through methods (getters & setters)
        //                 you should make attributes private if you don't have a reason to make them public/protected

//        Car car = new Car("Toyota", "Camry", 2020);
//        System.out.println(car.getMake());
//
//        // Using the setter method to change the value of the make, model, and year attribute
//        car.setYear(2003);
//        System.out.println(car.getYear());
//        car.setModel("Corolla");
//        System.out.println(car.getModel());
//        car.setMake("Honda");
//        System.out.println(car.getMake());

        // Copy Constructor = a constructor that accepts an object of the same class as a parameter
//        Car car1 = new Car("Toyota", "Camry", 2020);
//        Car car2 = new Car("Toyota", "Corolla", 2024);
//        car2.copy(car1);
//        System.out.println(car1);
//        System.out.println(car2 );
//
//        System.out.println(car1.getMake());
//        System.out.println(car2.getMake());
        // Interfaces = a template that can be applied to a class
        //             similar to inheritance, but specifies what a class has/must do
        //             classes can apply more than one interface, inheritance is limited to one superclass

//        Rabbit rabbit = new Rabbit();
//        rabbit.flee();
//
//        Hawk hawk = new Hawk();
//        hawk.hunt();
//
//        Fish fish = new Fish();
//        fish.flee();
//        fish.hunt();

        // Polymorsphism = many shapes, a method can do different things based on the object that it is acting upon
        //                method overriding = a child class providing a specific implementation of a method that is already provided by its parent class
        //                method overloading = methods within a class that have the same name but different parameters

//        Car car = new Car();
//        Bicycle bicycle = new Bicycle();
//        Boat boat = new Boat();
//
//        Vehicle[] racers = {car, bicycle, boat};
//
//        for (Vehicle racer : racers) {
//            racer.go();
//        }

        // Dynamic Polymorphism = the ability of a single method to do different things based on the object that it is acting upon
        //                         the method to be called is determined at runtime
        //                         method overriding is a perfect example of dynamic polymorphism
        //                         dynamic polymorphism is implemented by abstract classes and interfaces
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What animal do you want: ");
//        System.out.println("1. Dog, 2. Cat");
//        int choice = scanner.nextInt();
//        if (choice == 1){
//            Animal animal = new Dog();
//            animal.speak();
//        } else if (choice == 2){
//            Animal animal = new Cat();
//            animal.speak();
//        } else {
//            System.out.println("Invalid choice");
//            Animal animal = new Animal();
//            animal.speak();
//        }
//        switch (choice) {
//            case 1:
//                Animal animal = new Dog();
//                animal.speak();
//                break;
//            case 2:
//                Animal animal1 = new Cat();
//                animal1.speak();
//                break;
//            default:
//                System.out.println("Invalid choice");
//                Animal animal2 = new Animal();
//                animal2.speak();
//        }
        // Exception = an event that occurs during the execution of a program that disrupts the normal flow of instructions
        //            Exception Handling = the process of responding to exceptions
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Enter a number to divide : ");
//            int x = scanner.nextInt();
//            System.out.println("Enter a number to divide by : ");
//            int y = scanner.nextInt();
//
//
//            int z = x / y;
//            System.out.println(z);
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero");
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input");
//        } catch (Exception e) {
//            System.out.println("An error occurred");
//        } finally {
//            scanner.close();
//        }

        // File = an abstract representation of file and directory pathnames

//        File file = new File("/home/oluwafemi/Desktop/Psychology2e_WEB.pdf");
//        if (file.exists()){
//            System.out.println("File exists");
//            System.out.println("File name: " + file.getName());
//            System.out.println("Absolute path: " + file.getAbsolutePath());
//        } else {
//            System.out.println("File does not exist");
//        }
        try {
            FileWriter writer = new FileWriter("Test.docx \n I am doing this to test my skills in Java");
            writer.append("\n Author: Ogundare Oluwafemi");
            writer.write("Hello, this is a test file");
            writer.close();
            System.out.println("File created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}