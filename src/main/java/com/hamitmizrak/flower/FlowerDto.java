package com.hamitmizrak.flower;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class FlowerDto {
    private long id;

    @NotEmpty(message = "çiçek adını girmediniz")
    private String flowerName;

    @NotEmpty(message = "çiçek türünü girmediniz")
    private String flowerType;

    @NotEmpty(message = "çiçek fiyatını girmediniz")
    private String flowerPrice;

    //1-) DTO
    //2-) Entity
    //3-) Repository
    //4-) Controller
    //5-) Html
}
