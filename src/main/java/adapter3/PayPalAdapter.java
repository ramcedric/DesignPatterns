package adapter3;

public class PayPalAdapter implements PaymentProcessor {
    //attribute to hold the instance
    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        //constructor for the class
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(String amount) {
        //method for calling
        payPalPayment.makePayment(amount);
    }
}


//	Class Declaration: PayPalAdapter implements the PaymentProcessor interface,
//	allowing it to be used wherever a PaymentProcessor is expected.
//	Attribute: payPalPayment holds an instance of PayPalPayment.
//	Constructor: Initializes the payPalPayment attribute.
//	Method: processPayment adapts the makePayment method of PayPalPayment to the processPayment
//	method of the PaymentProcessor interface.