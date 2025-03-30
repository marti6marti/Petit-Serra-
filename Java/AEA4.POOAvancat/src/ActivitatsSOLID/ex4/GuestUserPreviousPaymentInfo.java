package ActivitatsSOLID.ex4;

class GuestUserPreviousPaymentInfo implements NewPayment {
    String name;

    public GuestUserPreviousPaymentInfo() {
        this.name = "guest";
    }


    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
        //Some other code, if any
    }
}