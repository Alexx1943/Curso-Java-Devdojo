package Parte16Concorrencia.Service;


import Parte16Concorrencia.Dominio.Discount;
import Parte16Concorrencia.Dominio.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {


    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format("%s %.2f: %s", storeName, price, discountCode);
    }

    public String applyDiscount(Quote quote){
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPorcentagem())/100;
        return String.format("%s ' Original price: '%.2f'. Applying discount code'%s'. Final price: '%.2f",
                quote.getStoreName(),
                quote.getPrice(),
                quote.getDiscountCode());
    }


    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 37;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
