package com.example.medicwearonline.models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class Product {
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private String size;
    @NonNull
    private BigDecimal coast;
    @NonNull
    private String image;
}
