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
public class ConsumerAccount implements Serializable {

    @Id
    @SequenceGenerator(name = "account_seq", sequenceName = "account_seq", initialValue = 10020100, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
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

