public class InvoiceTest{

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        invoice1.getInfo();
        invoice1.getInvoiceAmount(invoice1.getQuantityPurchased(), invoice1.getPricePerItem());

        System.out.println(" ");
        System.out.println("Invoice has been updated with the following data.");
        System.out.println(" ");

        invoice1.setPartNumberInvoice("xnA123");
        invoice1.setPartDescription("description2");
        invoice1.setQuantityPurchased(2);
        invoice1.setPricePerItem(10.5);
        invoice1.getInfo();
        invoice1.getInvoiceAmount(invoice1.getQuantityPurchased(), invoice1.getPricePerItem());

        invoice2.setPartNumberInvoice("xnA124");
        invoice2.setPartDescription("description3");
        invoice2.setQuantityPurchased(5);
        invoice2.setPricePerItem(15.0);
        invoice2.getInfo();
        invoice2.getInvoiceAmount(invoice2.getQuantityPurchased(), invoice2.getPricePerItem());
    }
}
