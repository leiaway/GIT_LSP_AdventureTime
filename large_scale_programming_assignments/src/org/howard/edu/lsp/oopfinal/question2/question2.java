/**
 * Name: Leilani Dexter
 */
package org.howard.edu.lsp.oopfinal.question2;

//Interface for payment strategy
interface PaymentStrategy {
 void pay(double pay);
}

//Concrete class: CreditCardPayment
class CreditCardPayment implements PaymentStrategy {
 private String creditCardNum;

 public CreditCardPayment(String creditCardNum) {
     this.creditCardNum = creditCardNum;
 }

 @Override
 public void pay(double pay) {
     System.out.println("Paid " + pay + " using credit card " + creditCardNum);
 }
}

//Concrete class:PayPal payment
class PayPalPayment implements PaymentStrategy {
 private String email;

 public PayPalPayment(String email) {
     this.email = email;
 }

 @Override
 public void pay(double pay) {
     System.out.println("Paid " + pay + " using PayPal account " + email);
 }
}

//Concrete class: Bitcoin payment
class BitcoinPayment implements PaymentStrategy {
 private String bitcoinAddress;

 public BitcoinPayment(String bitcoinAddress) {
     this.bitcoinAddress = bitcoinAddress;
 }

 @Override
 public void pay(double pay) {
     System.out.println("Paid " + pay + " using Bitcoin address " + bitcoinAddress);
 }
}

//ShoppingCart class
class ShoppingCart {
 private PaymentStrategy paymentStrategy;

 public ShoppingCart(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void checkout(double pay) { //checkout method
     paymentStrategy.pay(pay);
 }
}
