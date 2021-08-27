package kr.or.kosta.day03_2;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.kosta.conf.BeanConfig3_2;
import kr.or.kosta.data.Data1_2;
import kr.or.kosta.data.Data2_2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig3_2.class})
public class Beanconf3Test_2 {
	
	@Resource(name="data1_2")
	private Data1_2 ins;
	
	@Autowired @Qualifier("data2_2")
	private Data2_2 ins2;
	
	@Test
	public void test1() {
		assertNotNull(ins);
		assertNotNull(ins2);
		
		ins.prt();
		ins2.view();
	}

}
