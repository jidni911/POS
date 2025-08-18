package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "xcodes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Xcodes {

    @EmbeddedId
    private XcodesId id;

    @Column(name = "xacc")
    private String xacc;

    @Column(name = "xaccadj")
    private String xaccadj;

    @Column(name = "xaccait")
    private String xaccait;

    @Column(name = "xaccbank")
    private String xaccbank;

    @Column(name = "xaccbpadj")
    private String xaccbpadj;

    @Column(name = "xacccash")
    private String xacccash;

    @Column(name = "xaccdisc")
    private String xaccdisc;

    @Column(name = "xaccgvadj")
    private String xaccgvadj;

    @Column(name = "xaccother")
    private String xaccother;

    @Column(name = "xaccpur")
    private String xaccpur;

    @Column(name = "xaccrc")
    private String xaccrc;

    @Column(name = "xaccret")
    private String xaccret;

    @Column(name = "xaccsradj")
    private String xaccsradj;

    @Column(name = "xaccsrgainloss")
    private String xaccsrgainloss;

    @Column(name = "xaccsupptax")
    private String xaccsupptax;

    @Column(name = "xaccvat")
    private String xaccvat;

    @Column(name = "xaccwo")
    private String xaccwo;

    @Column(name = "xarea")
    private String xarea;

    @Column(name = "xdepmethod")
    private String xdepmethod;

    @Column(name = "xdeptname")
    private String xdeptname;

    @Column(name = "xdmwh")
    private String xdmwh;

    @Column(name = "xemail")
    private String xemail;

    @Column(name = "xfax")
    private String xfax;

    @Column(name = "xfield")
    private String xfield;

    @Column(name = "xhrc1")
    private String xhrc1;

    @Column(name = "xipaddress")
    private String xipaddress;

    @Column(name = "xitemdept")
    private String xitemdept;

    @Column(name = "xitemsubdept")
    private String xitemsubdept;

    @Column(name = "xlong")
    private String xlong;

    @Column(name = "xmadd")
    private String xmadd;

    @Column(name = "xpcode")
    private String xpcode;

    @Column(name = "xpercent")
    private BigDecimal xpercent;

    @Column(name = "xphone")
    private String xphone;

    @Column(name = "xprintername")
    private String xprintername;

    @Column(name = "xprops")
    private String xprops;

    @Column(name = "xregion")
    private String xregion;

    @Column(name = "xshopno")
    private String xshopno;

    @Column(name = "xtargetshare")
    private BigDecimal xtargetshare;

    @Column(name = "xterritory")
    private String xterritory;

    @Column(name = "xtrcode")
    private String xtrcode;

    @Column(name = "xtypeobj")
    private String xtypeobj;

    @Column(name = "xvatarea")
    private String xvatarea;

    @Column(name = "xvatrate")
    private BigDecimal xvatrate;

    @Column(name = "xvatregno")
    private String xvatregno;

    @Column(name = "xwh")
    private String xwh;

    @Column(name = "zactive")
    private String zactive;

    @Column(name = "zaip")
    private String zaip;

    @Column(name = "zauserid")
    private String zauserid;

    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zuip")
    private String zuip;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid")
    private String zuuserid;
}
