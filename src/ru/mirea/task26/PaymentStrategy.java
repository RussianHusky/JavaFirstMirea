package ru.mirea.task26;

public interface PaymentStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
