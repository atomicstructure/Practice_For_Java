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

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}