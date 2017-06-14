package com.sample.firstproject.unit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.sample.firstproject.base.AbstractJUnitTest;
import com.sample.firstproject.entity.SampleUser;
import com.sample.firstproject.repository.ISampleUserRepository;

@DatabaseSetup("/dataset/dataSet.xml")
public class SampeUserRepositoryTest extends AbstractJUnitTest {

	@Autowired
	private ISampleUserRepository repository;

	@After
	public void test() {

	}

	@Test
	public void countSampleUser() {
		Assert.assertEquals("Contou errado", 1L, repository.count());
	}

	@Test
	public void insertSampleUser() {
		SampleUser user = new SampleUser().setFirstName("Ciro").setEmail("ciro@email.com");
		repository.save(user);
		Assert.assertNotNull("Usuario nao inserido corretamente", user.getId());
		Assert.assertEquals("Usuario nao inserido corretamente", 2L, repository.count());
	}

	@Test
	public void updateSampeUser() {
		SampleUser user = repository.findOne(1L);
		user.setFirstName("João").setEmail("joao@email.com");
		repository.save(user);
		Assert.assertEquals("Usuario nao alterado corretamente", "João", repository.findOne(1L).getFirstName());
		Assert.assertEquals("Contou errado", 1L, repository.count());
	}

	@Test
	public void deleteSampleUser() {
		SampleUser user = new SampleUser().setId(1L);
		repository.delete(user);
		Assert.assertEquals("Usuario nao deletado corretamente", 0L, repository.count());
	}
}
