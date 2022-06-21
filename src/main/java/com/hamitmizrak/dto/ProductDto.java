package com.hamitmizrak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

//lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class ProductDto {

    private int id;
    @NotEmpty(message = "ürün adı boş geçilemez")
    private String productName;

    @NotEmpty(message = "ürün markası boş geçilemez")
    private String productTrade;

    @NotEmpty(message = "ürün fiyatı boş geçilemez")
    private String productPrice;

}
