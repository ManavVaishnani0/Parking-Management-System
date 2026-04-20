public class Main {
    public static void main(String[] args) {

        System.out.println("---- System Testing ----");

        Vehicle v = new Vehicle(1, "GJ01AB1234");
        ParkingSlot slot = new ParkingSlot(101);
        ParkingSystem system = new ParkingSystem();

        v.enterParking();

        if (system.checkAvailability(slot)) {

            system.assignSlot(slot);

            Ticket ticket = system.generateTicket();

            int fee = ticket.calculateFee();
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