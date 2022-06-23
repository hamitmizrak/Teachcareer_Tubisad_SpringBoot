package com.hamitmizrak.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

//http://localhost:8080/h2-console

//entity
@Entity
@Table(name = "computer")
public class ComputerEntity extends BaseEntity {

    @Column(name="computer_name",length = 250)
    private String computerName;

    @Column(name="computer_price")
    private double computerPrice;

}
