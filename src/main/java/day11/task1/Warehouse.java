package day11.task1;

public class Warehouse {

    private int countPickedOrders;
    private int countDeliveredOrders;

    // Getters and Setters
    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    // Methods
    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

    public void incrementPickerOrders() {
        countPickedOrders++;
    }

    public void incrementCourierOrders() {
        countDeliveredOrders++;
    }
}
