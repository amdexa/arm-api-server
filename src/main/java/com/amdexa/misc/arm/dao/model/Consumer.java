package com.amdexa.misc.arm.dao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode
public class Consumer implements Serializable {

    @Id
    @SequenceGenerator(name = "consumer_seq", sequenceName = "consumer_seq", initialValue = 1044020100, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consumer_seq")
    private Long id;

    private String status;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private String ssn;

    private String homePhone;

    private String workPhone;

    private boolean workConsent;

    private String cellPhone;

    private boolean cellConsent;

    private boolean smsConsent;

    private String lastCall;

    private String employer;

    private String jobTitle;

    private BigDecimal balance;

    private BigDecimal minimumPaymentAmount;

    @OneToMany(mappedBy = "consumer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ConsumerAccount> accounts;

    @OneToOne(mappedBy = "consumer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(mappedBy = "consumer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Spouse spouse;

}

