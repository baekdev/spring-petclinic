package org.springframework.samples.petclinic.proxy;

/**
 * @author baekdev
 * @since 2020-04-03
 * https://baek.dev
 */
public class Store {

    Payment payment;

    public Store(Payment payment) {
        this.payment = payment;
    }

    public void buySomething() {
        payment.pay(100);
    }
}
