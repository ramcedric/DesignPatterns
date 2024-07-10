package adapter3;

public class PayPalPayment {
    public void makePayment(String amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}


//	Class Declaration: PayPalPayment represents a PayPal payment system.
//	Method: makePayment(String amount) processes a PayPal payment by printing a
//	message indicating the payment amount.