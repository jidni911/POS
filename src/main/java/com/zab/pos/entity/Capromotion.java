package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "capromotion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(CapromotionId.class)
public class Capromotion {

    @Id
    @Column(name = "xpromono", length = 255, nullable = false)
    private String xpromono;

    @Id
    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "xamount", precision = 19, scale = 2)
    private BigDecimal xamount;

    @Column(name = "xbrand", length = 255)
    private String xbrand;

    @Column(name = "xcardtype", length = 255)
    private String xcardtype;

    @Column(name = "xcatitem", length = 255)
    private String xcatitem;

    @Column(name = "xcolor", length = 255)
    private String xcolor;

    @Column(name = "xdate")
    private LocalDateTime xdate;

    @Column(name = "xdateeff")
    private LocalDateTime xdateeff;

    @Column(name = "xdateexp")
    private LocalDateTime xdateexp;

    @Column(name = "xdesc", length = 255)
    private String xdesc;

    @Column(name = "xdisc", precision = 19, scale = 2)
    private BigDecimal xdisc;

    @Column(name = "xdisctype", length = 255)
    private String xdisctype;

    @Column(name = "xendtime")
    private LocalTime xendtime;

    @Column(name = "xitem", length = 255)
    private String xitem;

    @Column(name = "xnote", length = 255)
    private String xnote;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xstarttime")
    private LocalTime xstarttime;

    @Column(name = "xstatus", length = 255)
    private String xstatus;

    @Column(name = "xtype", length = 255)
    private String xtype;

    @Column(name = "xtypeobj", length = 255)
    private String xtypeobj;

    @Column(name = "xwh", length = 255)
    private String xwh;

    @Column(name = "zactive", length = 255)
    private String zactive;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid", length = 255)
    private String zuuserid;
}
