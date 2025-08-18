package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "xtrnp")
@IdClass(XtrnpId.class)  // because of composite primary key
public class Xtrnp {

    @Id
    @Column(name = "xtrn", nullable = false, length = 255)
    private String xtrn;

    @Id
    @Column(name = "xtyperel", nullable = false, length = 255)
    private String xtyperel;

    @Id
    @Column(name = "xtypetrn", nullable = false, length = 255)
    private String xtypetrn;

    @Column(name = "xrel", length = 255)
    private String xrel;

    @Column(name = "xrelbn", length = 255)
    private String xrelbn;

    @Column(name = "xreltn", length = 255)
    private String xreltn;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "zactive", length = 255)
    private String zactive;

    @Column(name = "zaip", length = 255)
    private String zaip;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zuip", length = 255)
    private String zuip;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid", length = 255)
    private String zuuserid;
}
