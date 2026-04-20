class Vehicle {
    private int vehicleId;
    private String number;

    public Vehicle(int id, String number) {
        this.vehicleId = id;
        this.number = number;
    }

    public void enterParking() {
        System.out.println("Vehicle Entered");
    }

    public void exitParking() {
        System.out.println("Vehicle Exited");
    }
}