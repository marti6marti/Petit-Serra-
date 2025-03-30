package ActivitatsSOLID.ex3;

class LanFax implements Fax , SendFax {
    @Override
    public void faxType() {
        System.out.println("Using lan fax to send the fax.");

    }

    @Override
    public void sendFax() {
        System.out.println("The LandFax sends a fax.");
    }
}
