package org.springframework.samples.petclinic.proxy;

/**
 * @author baekdev
 * @since 2020-04-03
 * https://baek.dev
 */
public class Cash implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println(amount + " 현금 결제");
    }
}
