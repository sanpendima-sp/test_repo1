package org.ioc;

public class PaymentService {
	private PaymentProcessor paymentProcessor;

	public PaymentService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	public void makePayment(String paymentInfo) {
		paymentProcessor.processPayment(paymentInfo);
		System.out.println("Payment made successfully.");
	}
}
