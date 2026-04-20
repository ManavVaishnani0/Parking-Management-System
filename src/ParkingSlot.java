class ParkingSlot {
    private int slotId;
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void assignSlot() {
        available = false;
    }

    public void freeSlot() {
        available = true;
    }
}