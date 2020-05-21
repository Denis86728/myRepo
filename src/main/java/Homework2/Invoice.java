package Homework2;

public class Invoice {
    public int quantityPurchased;

    String partNumberInvoice;

    String partDescription;

    double pricePerItem;

    public Invoice(int quantityPurchased, String partNumberInvoice, String partDescription, double pricePerItem) {
        this.quantityPurchased = quantityPurchased;
        this.partNumberInvoice = partNumberInvoice;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
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
        if (quantityPurchased <= 0) {
            quantityPurchased = 0;
        }
        this.quantityPurchased = quantityPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem <= 0.0) {
            pricePerItem = 0;
        }
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantityPurchased * pricePerItem;
    }

    public void getInfo() {
        System.out
            .println(
                "The invoice with number " + partNumberInvoice + " and description " + partDescription
                    + " has "
                    + quantityPurchased + " quantity purchased at " + pricePerItem);
    }

}
