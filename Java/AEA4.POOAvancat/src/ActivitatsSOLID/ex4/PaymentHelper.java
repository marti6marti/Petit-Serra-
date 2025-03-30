package ActivitatsSOLID.ex4;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {

    List<PreviousPaymentInfo> payments = new ArrayList<PreviousPaymentInfo>();


    public void addUser(PreviousPaymentInfo user) {
        payments.add(user);
    }

    public void showPreviousPayments() {
        for (PreviousPaymentInfo payment : payments) {
            payment.previousPaymentInfo();
            System.out.println("------");
        }
    }

    public void processNewPayments() {
        for (PreviousPaymentInfo payment : payments) {
            if (payment instanceof NewPayment){
                ((NewPayment) payment).newPayment();
            }
            System.out.println("------");
        }
    }
}