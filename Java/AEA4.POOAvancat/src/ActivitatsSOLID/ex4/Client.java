package ActivitatsSOLID.ex4;

class Client {

    public static void main(String[] args) {
        PaymentHelper helper = new PaymentHelper();

        // Instantiating two registered users
        RegisteredUserPreviousPaymentInfo robinPayment = new RegisteredUserPreviousPaymentInfo("Robin");
        RegisteredUserPreviousPaymentInfo jackPayment = new RegisteredUserPreviousPaymentInfo("Jack");

        // Adding the users to the helper
        helper.addUser(robinPayment);
        helper.addUser(jackPayment);

        GuestUserPreviousPaymentInfo guestUser = new GuestUserPreviousPaymentInfo();

        
        helper.showPreviousPayments();
        helper.processNewPayments();

    }

}
