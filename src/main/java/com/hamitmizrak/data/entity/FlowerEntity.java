package com.hamitmizrak.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "flower")
public class FlowerEntity extends BaseEntity {

    @Column(name = "flower_name")
    private String flowerName;

    @Column(name = "flower_type")
    private String flowerType;

    @Column(name = "flower_price")
    private String flowerPrice;

}
