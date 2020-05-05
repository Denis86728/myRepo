public class Invoice {

    public int quantityPurchased = 0;

    String partNumberInvoice = "xnA123";

    String partDescription = "description1";

    double pricePerItem = 10.5;

    public Invoice() {
        setPartNumberInvoice(partNumberInvoice);
        setPartDescription(partDescription);
        setQuantityPurchased(quantityPurchased);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumberInvoice() {
        return partNumberInvoice;
    }

    public void setPartNumberInvoice(String partNumberInvoice) {
        this.partNumberInvoice = partNumberInvoice;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void getInvoiceAmount(int quantityPurchased, double pricePerItem) {
        if (quantityPurchased <= 0) {
            quantityPurchased = 0;
            System.out.println("Quantity cannot be " + quantityPurchased);
        }
        if (pricePerItem <= 0.0) {
            pricePerItem = 0;
            System.out.println("PrincePerItem cannot be " + pricePerItem);
        }
        System.out.println("Invoice is: " + quantityPurchased * pricePerItem + "$");
    }

    public void getInfo() {
        System.out
            .println(
                "The invoice with number " + getPartNumberInvoice() + " and description " + getPartDescription()
                    + " has "
                    + getQuantityPurchased() + " quantity purchased at " + getPricePerItem());
    }
}
