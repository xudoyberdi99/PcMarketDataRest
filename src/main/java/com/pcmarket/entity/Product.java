package com.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;

    private String description;
    @Column(nullable = false)
    private Double price;

    private String warrantyMonths;
    @ManyToOne(optional = false)
    private Category category;
    @ManyToOne
    private Brand brand;
    @ManyToMany
    private Set<Attachment> attachment;

}
