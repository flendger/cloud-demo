package ru.flendger.clouddemo.feignclient.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.flendger.clouddemo.dto.ProductDto;
import ru.flendger.clouddemo.feignclient.interfaces.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/v1/products")
    List<ProductDto> findAll() {
        return productService.findAll();
    }
}
