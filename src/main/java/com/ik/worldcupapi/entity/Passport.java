package com.ik.worldcupapi.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passport_id")
    private Long passportId;

    private String name;

    private Timestamp date;

    @OneToMany(mappedBy = "stamp")
    private List<Stamp> stamps = new ArrayList<>();

}
