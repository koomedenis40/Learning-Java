public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean startCar() {
        System.out.println("The car " + name + " has started");
        return true;
    }
}
