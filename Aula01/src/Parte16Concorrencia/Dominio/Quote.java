package Parte16Concorrencia.Dominio;


// storeName:price:discountCode
public final class Quote {
    private final String storeName;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String storeName, double price, Discount.Code discountCode) {
        this.storeName = storeName;
        this.price = price;
        this.discountCode = discountCode;
    }


    /**
     * Creates new Quote object from the value following the pattern storeName:price:discountCode
     * @param value containing storeName:price:discount
     * @return new Quote vwith values from @param value
     */
    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return  new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "storeName='" + storeName + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}
