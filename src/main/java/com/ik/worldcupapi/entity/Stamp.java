package com.ik.worldcupapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "stamp")
public class Stamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stamp_id")
    private Long stampId;

    @ManyToOne
    @JoinColumn(name = "passport_id")
    private Passport passport;

    @Lob
    @Column(name = "image_data", nullable = false)
    private byte[] imageData;

    // Other fields...

    // Getters and setters...
}
