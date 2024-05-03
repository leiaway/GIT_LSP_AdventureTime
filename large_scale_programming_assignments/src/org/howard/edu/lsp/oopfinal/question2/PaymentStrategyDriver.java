/**
 * Name: Leilani Dexter
 */
package org.howard.edu.lsp.oopfinal.question2;

//PaymentStrategyDriver class

public class PaymentStrategyDriver {
	
 public static void main(String[] args) {
     //shopping cart w/ credit card payment strategy
     ShoppingCart cart = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456"));
     cart.checkout(100.0);

     // altered payment strategy to PayPal
     cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
     cart.checkout(50.0);

     // altered payment strategy to Bitcoin
     cart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
     cart.checkout(75.0);
 }
}