public class Bicycle extends Vehicle{
    @Override
    public void go() {
        System.out.println("The bicycle is moving");
    }
    @Override
    public void stop() {
        System.out.println("The bicycle has stopped");
    }
}
