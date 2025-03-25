package ActivitatsSOLID.ex3;

import java.util.ArrayList;
 import java.util.List;


class Client {

    public static void main(String[] args) {
        Printer advancedPrinter = new AdvancedPrinter();
        advancedPrinter.printDocument();
//        AdvancedPrinter.sendFax();

        Printer BasicPrinter = new BasicPrinter();
        BasicPrinter.printDocument();
//        BasicPrinter.sendFax();//Will throw error


//         List<Printer> printers = new ArrayList<Printer>();
//         printers.add(new dvancedPrinter());
//         printers.add(new BasicPrinter());
//
//         for (Printer device : printers) {
//             device.printDocument();
//            device.sendFax(); // Will throw error
//         }
//        printers.forEach(Printer::printDocument);//ok



    }

}
