public class Main {
    public static void main(String[] args) {

        System.out.println("---- System Testing ----");

        //  NORMAL CASE
        Vehicle v = new Vehicle(1, "GJ01AB1234");
        ParkingSlot slot = new ParkingSlot(101);
        ParkingSystem system = new ParkingSystem();

        v.enterParking();

        if (system.checkAvailability(slot)) {
            system.assignSlot(slot);

            Ticket ticket = system.generateTicket();
            System.out.println("Ticket ID: 1");

            int fee = ticket.calculateFee();
            boolean paid = system.processPayment(fee);

            if (paid) {
                v.exitParking();
                slot.freeSlot();
                System.out.println("Exit Successful");
            }
        }

        //  FAIL CASE 1: Parking Full
        System.out.println("\n---- Fail Case ----");

        ParkingSlot fullSlot = new ParkingSlot(102);
        fullSlot.assignSlot(); // already occupied

        if (!system.checkAvailability(fullSlot)) {
            System.out.println("Parking Full");
        }

        //  FAIL CASE 2: Payment Fail
        System.out.println("\n---- Payment Fail ----");

        Payment p = new Payment();
        p.makePayment(0); // invalid payment
    }
}