package com.springbootlearning.lil.learning_springboot.data;

import jakarta.persistence.*;

@Entity
@Table(name="GUEST")
public class Guest {
    @Id
    @Column(name="GUEST_ID")
    @GeneratedValue(strategy = GenerationType)
    private long guestId;


    FIRST_NAME VARCHAR(64),
    LAST_NAME VARCHAR(64),
    EMAIL_ADDRESS VARCHAR(64),
    ADDRESS VARCHAR(64),
    COUNTRY VARCHAR(32),
    STATE VARCHAR(12),
    PHONE_NUMBER VARCHAR(24)
}
