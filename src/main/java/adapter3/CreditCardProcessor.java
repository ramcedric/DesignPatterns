package adapter3;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}


//	Class Declaration: CreditCardProcessor implements the PaymentProcessor interface,
//	allowing it to be used wherever a PaymentProcessor is expected.
//	Method: processPayment prints a message indicating the processing of a credit card payment.