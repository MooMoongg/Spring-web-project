package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Runwith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {

	@Setter(onMethod_ = { @Autowired })
	private Restaurant restaurant;

	@Test
	private void testExist() {
		assertNotNull(restaurant);

		log.info(restaurant);
		log.info("--------------------------");
		log.info(restaurant.getChef());
	}

}
