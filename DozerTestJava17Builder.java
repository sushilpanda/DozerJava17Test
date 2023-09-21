package com.dozertest;

import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import com.github.dozermapper.core.loader.api.TypeMappingBuilder;
import com.github.dozermapper.core.loader.api.TypeMappingOptions;

public class DozerTestJava17Builder extends BeanMappingBuilder{

	protected TypeMappingBuilder testBuilder = null;

	@Override
	protected void configure() {
		testBuilder = mapping(DozerTestA.class, DozerTestB.class, TypeMappingOptions.wildcard(false),TypeMappingOptions.mapNull(true));
		testBuilder.fields("nameA", "nameB");

	}

}
