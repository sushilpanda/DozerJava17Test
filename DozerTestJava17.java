package com.dozertest;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerTestJava17 {

	
	
	public static void main(String[] args){
		DozerTestA a = new DozerTestA();
		a.setNameA("testA");
		DozerTestJava17Builder builder = new DozerTestJava17Builder();
		DozerBeanMapperBuilder db = DozerBeanMapperBuilder.create().withMappingBuilder(builder);
		Mapper mapper = db.build();
		DozerTestB b = mapper.map(a, DozerTestB.class);
		
		System.out.println(b.getNameB());
	}
}
