public class ParkingSystem {

    public boolean checkAvailability(ParkingSlot slot) {
        return slot.isAvailable();
    }

    public void assignSlot(ParkingSlot slot) {
        slot.assignSlot();
        System.out.println("Slot Assigned: " + slot.getSlotId());
    }

    public Ticket generateTicket() {
        return new Ticket(1, 2); // ticketId=1, duration=2 hours
    }

    public boolean processPayment(int amount) {
        Payment payment = new Payment();
        return payment.makePayment(amount);
    }
}