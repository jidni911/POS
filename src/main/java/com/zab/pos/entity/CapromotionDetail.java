package com.zab.pos.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "capromotiondetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(CapromotionDetailId.class)
public class CapromotionDetail {

    @Id
    @Column(name = "xpromono", length = 255, nullable = false)
    private String xpromono;

    @Id
    @Column(name = "xrow", nullable = false)
    private Integer xrow;

    @Id
    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "xamount", precision = 19, scale = 2)
    private BigDecimal xamount;

    @Column(name = "xbrand", length = 255)
    private String xbrand;

    @Column(name = "xcatitem", length = 255)
    private String xcatitem;

    @Column(name = "xdisc", precision = 19, scale = 2)
    private BigDecimal xdisc;

    @Column(name = "xdisctype", length = 255)
    private String xdisctype;

    @Column(name = "xitem", length = 255)
    private String xitem;

    @Column(name = "xnote", length = 255)
    private String xnote;

    @Column(name = "xqty")
    private Integer xqty;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xtype", length = 255)
    private String xtype;

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
