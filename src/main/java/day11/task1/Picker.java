package day11.task1;

public class Picker implements Worker {
    private double salary;
    private static boolean isPayed = false;
    private static int countPikers = 0;
    private static final int MAX_ORDER_PIKERS = 10000;
    private static final int BONUS_PIKERS = 70000;
    private static final int WORKING_RATE = 80;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        countPikers++;
    }

    // Getters and Setters
    public static int getCountPikers() {
        return countPikers;
    }

    public double getSalary() {
        return salary;
    }

    // Methods
    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += WORKING_RATE;
        warehouse.incrementPickerOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountPickedOrders() < MAX_ORDER_PIKERS) {
                System.out.println("Бонус пока не доступен");
            } else {
                salary += (BONUS_PIKERS / countPikers);
                isPayed = true;
            }
        }
    }
}
