package ru.flendger.clouddemo.feignclient.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.flendger.clouddemo.dto.ProductDto;

import java.util.List;

@FeignClient("eureka-client")
public interface ProductService {
    @GetMapping("/products/v1/all")
    List<ProductDto> findAll();
}
