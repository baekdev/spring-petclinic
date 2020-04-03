package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

/**
 * Proxy Class
 *
 * @author baekdev
 * @since 2020-04-03
 * https://baek.dev
 */
public class CashPerf implements Payment {

    Payment cash = new Cash();

    @Override
    public void pay(int amount) {
        final StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        cash.pay(amount);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

    }

}
