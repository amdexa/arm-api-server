package com.amdexa.misc.arm.dao.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode
public class Consumer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private String balance;

    private String lastCall;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private String last4SSN;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String postalCode;

    private String country;

    private String homePhone;

    private String homeUMConsent;

    private String workPhone;

    private String workConsent;

    private String workUMConsent;

    private String cellPhone;

    private String cellConsent;

    private String smSConsent;

    private String cellUMConsent;

    private String poEName;

    private String spouseFirstName;

    private String spouseLastName;

    private String spouseHomePhone;

    private String minimumPaymentAmount;

    @OneToMany(mappedBy = "consumer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ConsumerAccount> accounts;

}

