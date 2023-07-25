public class LinkedList<E> {
    private Node<E> head;

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void startAllCars() {
        Node<E> current = head;
        while (current != null) {
            if (current.getData() instanceof Driver) {
                Driver driver = (Driver) current.getData();
                Car car = driver.getCar();
                System.out.println(driver.getName() + " is starting " + car.getName());
                car.startCar();
            }
            current = current.getNext();
        }
    }
}
