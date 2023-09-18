package com.CaseStudy.ProductCatalogue.Entity;

import lombok.*;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="productdb")
public class ProductEntity {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="PRICE")
    private long price;

    @Column(name="AVAILABILITY")
    private boolean availability;

}
