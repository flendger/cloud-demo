package ru.flendger.clouddemo.eurekaclient.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.flendger.clouddemo.dto.ProductDto;
import ru.flendger.clouddemo.eurekaclient.mappers.EntityDtoMapper;
import ru.flendger.clouddemo.eurekaclient.model.Product;
import ru.flendger.clouddemo.eurekaclient.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final EntityDtoMapper<Product, ProductDto> mapper;

    public List<ProductDto> getAllProductDto() {
        return productRepository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
