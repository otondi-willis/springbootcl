package com.springbootlearning.lil.learning_springboot.data;

import jakarta.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long id;
    @Column(name="NAME")
    private String name;
    ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
    BED_INFO CHAR(2) NOT NULL
}
