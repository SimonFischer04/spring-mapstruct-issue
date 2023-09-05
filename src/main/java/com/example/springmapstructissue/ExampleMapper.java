package com.example.springmapstructissue;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

@Mapper(config = MapperSpringConfig.class)
public abstract class ExampleMapper implements Converter<ExampleDTO, Example> {
    /*
        this breaks
     */
    @Autowired
    ExampleService exampleService;

    /*
        this works
     */
//    @Autowired
//    ExampleServiceWithoutConversionService exampleServiceWithoutConversionService;

    @Override
    public abstract Example convert(@Nullable  ExampleDTO exampleDTO);
}
