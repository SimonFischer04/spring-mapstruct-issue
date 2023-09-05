package com.example.springmapstructissue;

import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(componentModel = "spring", uses = MyAdapter.class)
@SpringMapperConfig(
        conversionServiceAdapterPackage ="com.example.springmapstructissue",
        conversionServiceAdapterClassName ="MyAdapter"
)
public interface MapperSpringConfig {
}
