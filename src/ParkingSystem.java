class ParkingSystem {

    public boolean checkAvailability(ParkingSlot slot) {
        return slot.isAvailable();
    }

    public void assignSlot(ParkingSlot slot) {
        slot.assignSlot();
    }

    public Ticket generateTicket() {
        return new Ticket(1);
    }

    public boolean processPayment(int amount) {
        Payment p = new Payment();
        return p.makePayment(amount);
    }
}