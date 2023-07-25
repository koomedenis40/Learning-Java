public class Manager {
    public static void main(String[] args) {
        

        // Create cars and drivers
        Car car1 = new Car("BMW");
        Car car2 = new Car("Mercedez Benz");
        Car car3 = new Car("Ford Mustang");

        new Driver("Sarah", car1);
        new Driver("Denis", car2);
        new Driver("Priyanshu", car2);

      // Create a linked list to manage the drivers and cars
        LinkedList<Car> carList = new LinkedList<>();


        // Add drivers to the linked list
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        // Start the cars by their respective drivers
        carList.startAllCars();
    }
}
