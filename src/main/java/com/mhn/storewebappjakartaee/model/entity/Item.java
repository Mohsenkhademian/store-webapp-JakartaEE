package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "itemEntity")
@Table(name = "item")
public class Item extends BaseEntity {
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_description")
    private String description;
    @Column(name = "c_price")
    private double price;

    /*@OneToMany(mappedBy = "product")
    private List<Offer> offers;*/

    @OneToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
}
