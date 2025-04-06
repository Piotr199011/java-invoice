package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
    private Collection<Product> products=new ArrayList<>();
    private HashMap<Product,Integer>productQuantity=new HashMap<>();
    public void addProduct(Product product) {
      this.products.add(product);

    }

    public void addProduct(Product product, Integer quantity) {
   for (int i=0;i<quantity;i++) {
       addProduct(product);
   }

    }
    public BigDecimal getNetPrice() {

        BigDecimal subtotal = BigDecimal.ZERO;
        for (Product product : products) {
            subtotal = subtotal.add(product.getPriceWithTax());
        }
        return subtotal;
    }

    public BigDecimal getTax() {

        return BigDecimal.ZERO;
    }

    public BigDecimal getTotal() {

        return BigDecimal.ZERO;
    }
}
