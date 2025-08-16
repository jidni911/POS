package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "caitemprice")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(CaitempriceId.class)
public class Caitemprice {

    @Id
    @Column(name = "xitem", length = 255, nullable = false)
    private String xitem;

    @Id
    @Column(name = "xrow", nullable = false)
    private Integer xrow;

    @Column(name = "xcartoon", precision = 19, scale = 2)
    private BigDecimal xcartoon;

    @Column(name = "xcost", precision = 19, scale = 2)
    private BigDecimal xcost;

    @Column(name = "xdate")
    private LocalDateTime xdate;

    @Column(name = "xdateeff")
    private LocalDateTime xdateeff;

    @Column(name = "xdateexp")
    private LocalDateTime xdateexp;

    @Column(name = "xdealerp", precision = 19, scale = 2)
    private BigDecimal xdealerp;

    @Column(name = "xdisc", precision = 19, scale = 2)
    private BigDecimal xdisc;

    @Column(name = "xdisctype", length = 255)
    private String xdisctype;

    @Column(name = "xdiv", length = 255)
    private String xdiv;

    @Column(name = "xendtime")
    private LocalTime xendtime;

    @Column(name = "xmrp", precision = 19, scale = 2)
    private BigDecimal xmrp;

    @Column(name = "xoldcost", precision = 19, scale = 2)
    private BigDecimal xoldcost;

    @Column(name = "xoldrate", precision = 19, scale = 2)
    private BigDecimal xoldrate;

    @Column(name = "xpacking", length = 255)
    private String xpacking;

    @Column(name = "xpackqty", precision = 19, scale = 2)
    private BigDecimal xpackqty;

    @Column(name = "xpricerow")
    private Integer xpricerow;

    @Column(name = "xqty", precision = 19, scale = 2)
    private BigDecimal xqty;

    @Column(name = "xrate", precision = 19, scale = 2)
    private BigDecimal xrate;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xstarttime")
    private LocalTime xstarttime;

    @Column(name = "xsupptaxrate", precision = 19, scale = 2)
    private BigDecimal xsupptaxrate;

    @Column(name = "xvatamt", precision = 19, scale = 2)
    private BigDecimal xvatamt;

    @Column(name = "xvatrate", precision = 19, scale = 2)
    private BigDecimal xvatrate;

    @Column(name = "xyearperdate")
    private Integer xyearperdate;

    @Column(name = "zactive", length = 255)
    private String zactive;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "zid")
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid", length = 255)
    private String zuuserid;
}
