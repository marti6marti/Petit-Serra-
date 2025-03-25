package ex3;

class EFax implements Fax , SendFax{
    @Override
    public void faxType() {
        System.out.println("Using internet fax(efax) to send the fax.");
    }


    @Override
    public void sendFax() {
        System.out.println("The EFax sends a fax.");
    }
}