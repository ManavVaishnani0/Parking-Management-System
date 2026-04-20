public class Main {
    public static void main(String[] args) {

        System.out.println("---- System Testing ----");

        Vehicle v = new Vehicle(1, "GJ01AB1234");
        ParkingSlot slot = new ParkingSlot();
        ParkingSystem system = new ParkingSystem();

        v.enterParking();

        if (system.checkAvailability(slot)) {
            system.assignSlot(slot);
            Ticket t = system.generateTicket();
            System.out.println("Slot Assigned");

            int fee = t.calculateFee();
            boolean paid = system.processPayment(fee);

            if (paid) {
                v.exitParking();
                slot.freeSlot();
                System.out.println("Exit Successful");
            }
        } else {
            System.out.println("Parking Full");
        }
    }
}