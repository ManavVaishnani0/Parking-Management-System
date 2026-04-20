public class Vehicle {
    private int vehicleId;
    private String number;

    public Vehicle(int vehicleId, String number) {
        this.vehicleId = vehicleId;
        this.number = number;
    }

    public void enterParking() {
        System.out.println("Vehicle Entered: " + number);
        System.out.println("Vehicle ID: " + vehicleId);

    }

    public void exitParking() {
        System.out.println("Vehicle Exited: " + number);
    }
}