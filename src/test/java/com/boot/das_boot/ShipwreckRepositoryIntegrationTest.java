package com.boot.das_boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.das_boot.model.Shipwreck;
import com.boot.das_boot.repository.ShipwreckRepository;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(App.class)
@RunWith(SpringRunner.class)
@DataJpaTest
public class ShipwreckRepositoryIntegrationTest {

	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@Test
	public void testFindAll() {
		List<Shipwreck> wrecks = shipwreckRepository.findAll();
		assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
	}
}
