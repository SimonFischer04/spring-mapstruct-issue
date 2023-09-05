package com.example.springmapstructissue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    @Autowired
    ConversionService conversionService;

    // methods that do something ...
}
