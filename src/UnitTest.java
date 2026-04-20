public class UnitTest {
    public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot();

        // Test availability
        System.out.println("Test Availability: " + slot.isAvailable());

        // Test assign
        slot.assignSlot();
        System.out.println("After Assign: " + slot.isAvailable());

        // Test free slot
        slot.freeSlot();
        System.out.println("After Free: " + slot.isAvailable());

        // Test payment
        Payment p = new Payment();
        System.out.println("Payment Test: " + p.makePayment(100));
    }
}