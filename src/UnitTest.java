public class UnitTest {
    public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot(1);

        System.out.println("Initial Available: " + slot.isAvailable());

        slot.assignSlot();
        System.out.println("After Assign: " + slot.isAvailable());

        slot.freeSlot();
        System.out.println("After Free: " + slot.isAvailable());

        Payment p = new Payment();
        System.out.println("Payment Test: " + p.makePayment(100));
    }
}