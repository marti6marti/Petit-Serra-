package ActivitatsSOLID.ex3;

import java.util.ArrayList;
import java.util.List;


class Client {

    public static void main(String[] args) {
        Printer advancedPrinter = new AdvancedPrinter();
        advancedPrinter.printDocument();
        ((AdvancedPrinter) advancedPrinter).sendFax();


        Printer basicPrinter = new BasicPrinter();
        basicPrinter.printDocument();


         List<Printer> printers = new ArrayList<Printer>();
         printers.add(new AdvancedPrinter());
         printers.add(new BasicPrinter());

        System.out.println();

         for (Printer device : printers) {
             device.printDocument();
             if (device instanceof AdvancedPrinter){
                 ((AdvancedPrinter) device).sendFax();
             }
         }

        System.out.println();
        printers.forEach(Printer::printDocument);

        Fax efax = new EFax();
        efax.faxType();
        ((EFax) efax).sendFax();

        Fax lanFax = new LanFax();
        lanFax.faxType();
        ((LanFax) lanFax).sendFax();

        List<Fax> faxes = new ArrayList<Fax>();
        faxes.add(new LanFax());
        faxes.add(new EFax());

        System.out.println();

        for (Fax device : faxes) {
            device.faxType();
            if (device instanceof EFax){
                ((EFax) device).sendFax();
            } else if (device instanceof LanFax) {
                ((LanFax) device).sendFax();
            }
        }

        System.out.println();
        faxes.forEach(Fax::faxType);

    }
}
