package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

/**
 * @author baekdev
 * @since 2020-04-03
 * https://baek.dev
 */
class StoreTest {

    @Test
    public void testPay() {
        final Store store = new Store(new CashPerf());
        store.buySomething();
    }

}
