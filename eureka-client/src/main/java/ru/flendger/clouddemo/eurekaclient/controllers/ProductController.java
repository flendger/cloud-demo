package ru.flendger.clouddemo.eurekaclient.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.flendger.clouddemo.dto.ProductDto;
import ru.flendger.clouddemo.eurekaclient.services.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping(path = "/v1/all")
    public List<ProductDto> getAll() {
        return productService.getAllProductDto();
    }
}
