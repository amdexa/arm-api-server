package com.amdexa.misc.arm.dao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(exclude = {"consumer"})
public class ConsumerAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "consumer_id", nullable = false)
    private Consumer consumer;

    private String clientName;

    private String listDate;

    private String comakerFirstName;

    private String comakerLastName;

    private String attorneyName;

    private String attorneyPhone;

}

