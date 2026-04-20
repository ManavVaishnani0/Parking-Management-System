public class UnitTest {
    public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot(1);

        // Check initial availability
        System.out.println("Initial Available: " + slot.isAvailable());

        // Assign slot
        slot.assignSlot();
        System.out.println("After Assign: " + slot.isAvailable());

        // Free slot
        slot.freeSlot();
        System.out.println("After Free: " + slot.isAvailable());

        // Valid payment
        Payment p = new Payment();
        System.out.println("Payment Test: " + p.makePayment(100));

        // Invalid payment
        System.out.println("Payment Test: " + p.makePayment(0));
    }
}