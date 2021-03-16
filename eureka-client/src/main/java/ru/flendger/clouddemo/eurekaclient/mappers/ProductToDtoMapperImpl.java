package ru.flendger.clouddemo.eurekaclient.mappers;

import org.springframework.stereotype.Component;
import ru.flendger.clouddemo.dto.ProductDto;
import ru.flendger.clouddemo.eurekaclient.model.Product;

@Component
public class ProductToDtoMapperImpl implements EntityDtoMapper<Product, ProductDto> {
    @Override
    public ProductDto toDto(Product entity) {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setPrice(entity.getPrice());
        return dto;
    }
}
