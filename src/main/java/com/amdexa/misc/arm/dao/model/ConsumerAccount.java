package com.amdexa.misc.arm.dao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode
public class ConsumerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;

    @ManyToOne
    @JoinColumn(name="consumer_id", nullable=false)
    private Consumer consumer;

    private String clientName;

    private String listDate;

    private String comakerFirstName;

    private String comakerLastName;

    private String attorneyName;

    private String attorneyPhone;

}

