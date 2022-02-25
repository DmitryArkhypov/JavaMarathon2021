package day11.task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed = false;
    private static int countCouriers = 0;
    private static final int MAX_ORDER_COURIERS = 10000;
    private static final int BONUS_COURIERS = 50000;
    private static final int WORKING_RATE = 100;

    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        countCouriers++;
    }

    // Getters and Setters
    public static int getCountCouriers() {
        return countCouriers;
    }

    public double getSalary() {
        return salary;
    }

    // Methods
    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += WORKING_RATE;
        warehouse.incrementCourierOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountDeliveredOrders() < MAX_ORDER_COURIERS) {
                System.out.println("Бонус пока не доступен");
            } else {
                salary += (BONUS_COURIERS / countCouriers);
                isPayed = true;
            }
        }
    }
}
