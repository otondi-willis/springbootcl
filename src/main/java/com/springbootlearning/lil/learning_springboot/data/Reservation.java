package com.springbootlearning.lil.learning_springboot.data;

import jakarta.persistence.*;

@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @Column(name="RESERVATI_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;
    @Column(name="ROOM_ID")
    private long roomId;

    GUEST_ID BIGINT NOT NULL,
    RES_DATE DATE

}
