package com.springbootlearning.lil.learning_springboot.data;

import jakarta.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long id;

    NAME VARCHAR(16) NOT NULL,
    ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
    BED_INFO CHAR(2) NOT NULL
}
