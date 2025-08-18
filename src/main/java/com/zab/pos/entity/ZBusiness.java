package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "zbusiness")
@Data                   // Generates getters, setters, equals, hashCode, toString
@NoArgsConstructor      // No-args constructor
@AllArgsConstructor     // All-args constructor
@Builder                // Builder pattern support
public class ZBusiness {

    @Id
    @Column(name = "zid", nullable = false)
    private Integer zid;

    private String xbimage;
    private String xcity;
    private String xcontact;
    private String xcountry;
    private String xcur;
    private String xcustom;
    private String xdesignation;
    private String xdformat;
    private String xdiv;
    private String xdsep;
    private String xemail;
    private String xfax;
    private String ximage;
    private String xmadd;
    private String xpadd;
    private String xphone;
    private String xshopno;
    private String xshort;
    private String xsignatory;
    private String xstate;
    private String xtaxnum;
    private String xterminal;
    private String xtimage;
    private String xtin;
    private String xurl;
    private String xvatregno;
    private String xzip;
    private String zactive;
    private String zaip;
    private String zauserid;
    private String zemail;
    private String zorg;

    @Column(columnDefinition = "datetime2")
    private LocalDateTime ztime;

    private String zuip;

    @Column(columnDefinition = "datetime2")
    private LocalDateTime zutime;

    private String zuuserid;
}
