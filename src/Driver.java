public class Driver {
    private String name;
    private Car bmw;

    public Driver(String name, Car car) {
        this.name = name;
        this.bmw = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return bmw;
    }

    public void getGoing() {
        bmw.startCar();
    }
}
