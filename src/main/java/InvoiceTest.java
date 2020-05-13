public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice(0, "xnA123", "description1", 0);
        Invoice invoice2 = new Invoice(0, "xnB123", "description2", 0);

        invoice1.getInfo();
        invoice1.setQuantityPurchased(5);
        invoice1.setPricePerItem(10.5);
        System.out.println("The invoice details have been updated");
        invoice1.getInfo();
        System.out.println("Invoice amount: " + invoice1.getInvoiceAmount() + "$");

        System.out.println(" ");

        invoice2.getInfo();
        invoice2.setQuantityPurchased(10);
        invoice2.setPricePerItem(15.5);
        System.out.println("The invoice details have been updated");
        invoice2.getInfo();
        System.out.println("Invoice amount: " + invoice2.getInvoiceAmount() + "$");
    }
}
