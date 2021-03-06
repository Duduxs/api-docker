package com.edudev.dockerapi.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "tb_property")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Getter
public final class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer id;

    private String description;

    private String address;

    private BigDecimal price;

    private Integer rooms;

    private final PropertyType propertyType;

    private final Instant createdAt = Instant.now();

    private Instant updatedAt = Instant.now();
}
