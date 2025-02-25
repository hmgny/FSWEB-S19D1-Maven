package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="fruit", schema="fsweb")
public class Fruit extends Plant {

    @NotNull
    @Column(name="fruit_type")
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

}
