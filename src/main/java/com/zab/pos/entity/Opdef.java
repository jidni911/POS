package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "opdef")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Opdef {

    @Id
    @Column(name = "xacc", length = 255, nullable = false)
    private String xacc;

    @Column(name = "xcusserial", length = 255)
    private String xcusserial;

    @Column(name = "xdate")
    private LocalDateTime xdate;

    @Column(name = "xdesc", length = 255)
    private String xdesc;

    @Column(name = "xdisc", precision = 19, scale = 2)
    private BigDecimal xdisc;

    @Column(name = "xlength")
    private Integer xlength;

    @Column(name = "xrel", length = 255)
    private String xrel;

    @Column(name = "xsdcat", length = 255)
    private String xsdcat;

    @Column(name = "xservicecharge", precision = 19, scale = 2)
    private BigDecimal xservicecharge;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xsupserial", length = 255)
    private String xsupserial;

    @Column(name = "xtrn", length = 255)
    private String xtrn;

    @Column(name = "xvatcat", length = 255)
    private String xvatcat;

    @Column(name = "xvatrate", precision = 19, scale = 2)
    private BigDecimal xvatrate;

    @Column(name = "xyear")
    private Integer xyear;

    @Column(name = "xyearperdate")
    private Integer xyearperdate;

    @Column(name = "zactive", length = 255)
    private String zactive;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "zemail", length = 255)
    private String zemail;

    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid", length = 255)
    private String zuuserid;
}
