package com.eshop.mapper.test;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eshop.mapper.TbBrandMapper;
import com.eshop.pojo.TbBrand;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/applicationContext-*.xml"})
public class TbBrandMapperTest {
    
	@Autowired
	private TbBrandMapper brandMapper;
	
	@Test
	public void testTbBrandMapper(){
		List<TbBrand> list = brandMapper.selectByExample(null);
		for(TbBrand tb:list){
			System.out.println(tb.getId());
			System.out.println(tb.getName());
		}
	}
}
