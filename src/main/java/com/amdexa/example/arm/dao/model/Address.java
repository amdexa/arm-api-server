package com.amdexa.example.arm.dao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(exclude = {"consumer"})
@ToString(exclude = {"consumer"})
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "consumer_id", nullable = false)
    private Consumer consumer;

    @Column(name = "add_line1")
    private String postalAddressLine1;

    @Column(name = "add_line2")
    private String postalAddressLine2;

    private String city;

    private String state;

    private String postalCode;

    private String country;

}
