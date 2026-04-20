class Payment {
    public boolean makePayment(int amount) {
        if (amount > 0) {
            return true;
        }
        return false;
    }
}