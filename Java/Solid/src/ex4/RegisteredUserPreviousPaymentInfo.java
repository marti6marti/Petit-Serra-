package   ex4;

class RegisteredUserPreviousPaymentInfo implements PreviousPaymentInfo ,NewPayment {
    String name;

    public RegisteredUserPreviousPaymentInfo(String userName) {
        this.name = userName;
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("Retrieving " + name + "'s last payment details.");
        // Some other code, if any
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
        // Some other code, if any
    }
}
