package org.springframework.samples.petclinic.sample;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author baekdev
 * @since 2020-03-30 https://baek.dev
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTest {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testDI() {
		SampleController bean = applicationContext.getBean(SampleController.class);
		Assertions.assertThat(bean).isNotNull();
	}

}
