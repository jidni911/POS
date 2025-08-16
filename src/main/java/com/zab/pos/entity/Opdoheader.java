package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "opdoheader")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Opdoheader {

    @Id
    @Column(name = "xdornum", length = 255, nullable = false)
    private String xdornum;

    @Column(name = "xacashamt", precision = 19, scale = 2)
    private BigDecimal xacashamt;

    @Column(name = "xacrdamt", precision = 19, scale = 2)
    private BigDecimal xacrdamt;

    @Column(name = "xadamount", precision = 19, scale = 2)
    private BigDecimal xadamount;

    @Column(name = "xadvposvchr", length = 255)
    private String xadvposvchr;

    @Column(name = "xait", precision = 19, scale = 2)
    private BigDecimal xait;

    @Column(name = "xaitamt", precision = 19, scale = 2)
    private BigDecimal xaitamt;

    @Column(name = "xaitf", precision = 19, scale = 2)
    private BigDecimal xaitf;

    @Column(name = "xamount", precision = 19, scale = 2)
    private BigDecimal xamount;

    @Column(name = "xarea", length = 255)
    private String xarea;

    @Column(name = "xassessval", precision = 19, scale = 2)
    private BigDecimal xassessval;

    @Column(name = "xassessval1", precision = 19, scale = 2)
    private BigDecimal xassessval1;

    @Column(name = "xassessval2", precision = 19, scale = 2)
    private BigDecimal xassessval2;

    @Column(name = "xassessval3", precision = 19, scale = 2)
    private BigDecimal xassessval3;

    @Column(name = "xavlperc", precision = 19, scale = 2)
    private BigDecimal xavlperc;

    @Column(name = "xbank", length = 255)
    private String xbank;

    @Column(name = "xbillno", length = 255)
    private String xbillno;

    @Column(name = "xbonuspoints", precision = 19, scale = 2)
    private BigDecimal xbonuspoints;

    @Column(name = "xcardamt", precision = 19, scale = 2)
    private BigDecimal xcardamt;

    @Column(name = "xcardno", length = 255)
    private String xcardno;

    @Column(name = "xcardtype", length = 255)
    private String xcardtype;

    @Column(name = "xcashamt", precision = 19, scale = 2)
    private BigDecimal xcashamt;

    @Column(name = "xchange", precision = 19, scale = 2)
    private BigDecimal xchange;

    @Column(name = "xcheaker", length = 255)
    private String xcheaker;

    @Column(name = "xchgsamt", precision = 19, scale = 2)
    private BigDecimal xchgsamt;

    @Column(name = "xchgscard", precision = 19, scale = 2)
    private BigDecimal xchgscard;

    @Column(name = "xcomm", precision = 19, scale = 2)
    private BigDecimal xcomm;

    @Column(name = "xcomm1", precision = 19, scale = 2)
    private BigDecimal xcomm1;

    @Column(name = "xcomm2", precision = 19, scale = 2)
    private BigDecimal xcomm2;

    @Column(name = "xcomm3", precision = 19, scale = 2)
    private BigDecimal xcomm3;

    @Column(name = "xcommin", precision = 19, scale = 2)
    private BigDecimal xcommin;

    @Column(name = "xcpo", length = 255)
    private String xcpo;

    @Column(name = "xcrdcardno", length = 255)
    private String xcrdcardno;

    @Column(name = "xcrnamt", precision = 19, scale = 2)
    private BigDecimal xcrnamt;

    @Column(name = "xcrngainamt", precision = 19, scale = 2)
    private BigDecimal xcrngainamt;

    @Column(name = "xcrnnum", length = 255)
    private String xcrnnum;

    @Column(name = "xcrterms")
    private Integer xcrterms;

    @Column(name = "xctype", length = 255)
    private String xctype;

    @Column(name = "xcur", length = 255)
    private String xcur;

    @Column(name = "xcus", length = 255)
    private String xcus;

    @Column(name = "xdate")
    private LocalDateTime xdate;

    @Column(name = "xdatechk")
    private LocalDateTime xdatechk;

    @Column(name = "xdatecom")
    private LocalDateTime xdatecom;

    @Column(name = "xdatecpo")
    private LocalDateTime xdatecpo;

    @Column(name = "xdatedel")
    private LocalDate xdatedel;

    @Column(name = "xdatedf")
    private LocalDateTime xdatedf;

    @Column(name = "xdatedmddc")
    private LocalDateTime xdatedmddc;

    @Column(name = "xdatedph")
    private LocalDateTime xdatedph;

    @Column(name = "xdatedue")
    private LocalDate xdatedue;

    @Column(name = "xdateed")
    private LocalDateTime xdateed;

    @Column(name = "xdategm")
    private LocalDateTime xdategm;

    @Column(name = "xdatemanager")
    private LocalDateTime xdatemanager;

    @Column(name = "xdatepo")
    private LocalDate xdatepo;

    @Column(name = "xdeltime", length = 255)
    private String xdeltime;

    @Column(name = "xdisc", precision = 19, scale = 2)
    private BigDecimal xdisc;

    @Column(name = "xdiscamt", precision = 19, scale = 2)
    private BigDecimal xdiscamt;

    @Column(name = "xdiscf", precision = 19, scale = 2)
    private BigDecimal xdiscf;

    @Column(name = "xdiv", length = 255)
    private String xdiv;

    @Column(name = "xdmddc", length = 255)
    private String xdmddc;

    @Column(name = "xdoctype", length = 255)
    private String xdoctype;

    @Column(name = "xdphead", length = 255)
    private String xdphead;

    @Column(name = "xearnedbonusamt", precision = 19, scale = 2)
    private BigDecimal xearnedbonusamt;

    @Column(name = "xearnedbonuspoints", precision = 19, scale = 2)
    private BigDecimal xearnedbonuspoints;

    @Column(name = "xed", length = 255)
    private String xed;

    @Column(name = "xexch", precision = 19, scale = 2)
    private BigDecimal xexch;

    @Column(name = "xexpamt", precision = 19, scale = 2)
    private BigDecimal xexpamt;

    @Column(name = "xexpetriot", length = 255)
    private String xexpetriot;

    @Column(name = "xfield", length = 255)
    private String xfield;

    @Column(name = "xfm", length = 255)
    private String xfm;

    @Column(name = "xfwh", length = 255)
    private String xfwh;

    @Column(name = "xgiftitem", length = 255)
    private String xgiftitem;

    @Column(name = "xgiftvoucher", length = 255)
    private String xgiftvoucher;

    @Column(name = "xgmdf", length = 255)
    private String xgmdf;

    @Column(name = "xissuebank", length = 255)
    private String xissuebank;

    @Column(name = "xlong", length = 255)
    private String xlong;

    @Column(name = "xmanager", length = 255)
    private String xmanager;

    @Column(name = "xmarket", length = 255)
    private String xmarket;

    @Column(name = "xnetamt", precision = 19, scale = 2)
    private BigDecimal xnetamt;

    @Column(name = "xnetret", precision = 19, scale = 2)
    private BigDecimal xnetret;

    @Column(name = "xnote", length = 255)
    private String xnote;

    @Column(name = "xnote1", length = 255)
    private String xnote1;

    @Column(name = "xnote2", length = 255)
    private String xnote2;

    @Column(name = "xnote3", length = 255)
    private String xnote3;

    @Column(name = "xordernum", length = 255)
    private String xordernum;

    @Column(name = "xorg", length = 255)
    private String xorg;

    @Column(name = "xpaid", precision = 19, scale = 2)
    private BigDecimal xpaid;

    @Column(name = "xpaymentterm", length = 255)
    private String xpaymentterm;

    @Column(name = "xpaymenttype", length = 255)
    private String xpaymenttype;

    @Column(name = "xpaystatus", length = 255)
    private String xpaystatus;

    @Column(name = "xpaytype", length = 255)
    private String xpaytype;

    @Column(name = "xper")
    private Integer xper;

    @Column(name = "xperson", length = 255)
    private String xperson;

    @Column(name = "xphone", length = 255)
    private String xphone;

    @Column(name = "xpornum", length = 255)
    private String xpornum;

    @Column(name = "xpp", length = 255)
    private String xpp;

    @Column(name = "xpreparer", length = 255)
    private String xpreparer;

    @Column(name = "xprime", precision = 19, scale = 2)
    private BigDecimal xprime;

    @Column(name = "xproject", length = 255)
    private String xproject;

    @Column(name = "xpromono", length = 255)
    private String xpromono;

    @Column(name = "xqotnum", length = 255)
    private String xqotnum;

    @Column(name = "xref", length = 255)
    private String xref;

    @Column(name = "xregion", length = 255)
    private String xregion;

    @Column(name = "xroundingchange", precision = 19, scale = 2)
    private BigDecimal xroundingchange;

    @Column(name = "xroute", length = 255)
    private String xroute;

    @Column(name = "xrsm", length = 255)
    private String xrsm;

    @Column(name = "xserialall", length = 255)
    private String xserialall;

    @Column(name = "xsex", length = 255)
    private String xsex;

    @Column(name = "xshift", length = 255)
    private String xshift;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xsm", length = 255)
    private String xsm;

    @Column(name = "xsp", length = 255)
    private String xsp;

    @Column(name = "xspdiscamt", precision = 19, scale = 2)
    private BigDecimal xspdiscamt;

    @Column(name = "xstatus", length = 255)
    private String xstatus;

    @Column(name = "xstatusar", length = 255)
    private String xstatusar;

    @Column(name = "xstatusdor", length = 255)
    private String xstatusdor;

    @Column(name = "xstatusjv", length = 255)
    private String xstatusjv;

    @Column(name = "xstatusord", length = 255)
    private String xstatusord;

    @Column(name = "xstatusprint", length = 255)
    private String xstatusprint;

    @Column(name = "xsumnum", length = 255)
    private String xsumnum;

    @Column(name = "xsuperiorsp", length = 255)
    private String xsuperiorsp;

    @Column(name = "xsupptaxamt", precision = 19, scale = 2)
    private BigDecimal xsupptaxamt;

    @Column(name = "xtaxamt", precision = 19, scale = 2)
    private BigDecimal xtaxamt;

    @Column(name = "xtaxrate", precision = 19, scale = 2)
    private BigDecimal xtaxrate;

    @Column(name = "xterminal", length = 255)
    private String xterminal;

    @Column(name = "xterritory", length = 255)
    private String xterritory;

    @Column(name = "xtotamt", precision = 19, scale = 2)
    private BigDecimal xtotamt;

    @Column(name = "xtype", length = 255)
    private String xtype;

    @Column(name = "xvatamt", precision = 19, scale = 2)
    private BigDecimal xvatamt;

    @Column(name = "xvatf", precision = 19, scale = 2)
    private BigDecimal xvatf;

    @Column(name = "xvatrate", precision = 19, scale = 2)
    private BigDecimal xvatrate;

    @Column(name = "xvoucher", length = 255)
    private String xvoucher;

    @Column(name = "xvoucheramt", precision = 19, scale = 2)
    private BigDecimal xvoucheramt;

    @Column(name = "xwh", length = 255)
    private String xwh;

    @Column(name = "xworkingdate")
    private LocalDateTime xworkingdate;

    @Column(name = "xyear")
    private Integer xyear;

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
