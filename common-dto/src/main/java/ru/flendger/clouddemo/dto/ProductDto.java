package ru.flendger.clouddemo.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private int price;
}
