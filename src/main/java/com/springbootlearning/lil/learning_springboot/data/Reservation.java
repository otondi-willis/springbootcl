package com.springbootlearning.lil.learning_springboot.data;

import jakarta.persistence.*;

@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @Column(name="RESERVATI_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;
    RESERVATION_ID BIGSERIAL PRIMARY KEY,
    ROOM_ID BIGINT NOT NULL,
    GUEST_ID BIGINT NOT NULL,
    RES_DATE DATE

}
