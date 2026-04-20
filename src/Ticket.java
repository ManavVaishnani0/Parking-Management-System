class Ticket {
    private int ticketId;
    private int duration;

    public Ticket(int id) {
        this.ticketId = id;
    }

    public int calculateFee() {
        return duration * 10;
    }
}