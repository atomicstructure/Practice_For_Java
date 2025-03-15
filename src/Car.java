public class Car{

//    @Override
//    void go() {
//        System.out.println("The car is moving");
//    }
//
//    @Override
//    void stop() {
//        System.out.println("The car has stopped");
//    }

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
