package com.zab.pos.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "cacus")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cacus {

    @Id
    @Column(name = "xcus", length = 255, nullable = false)
    private String xcus;

    private String xacc;
    private String xacctype;
    private String xallbndisc;
    private String xallowcrinv;

    private BigDecimal xassessval1;
    private BigDecimal xassessval2;
    private BigDecimal xassessval3;

    private String xbank;
    private String xbeneficiary;

    private LocalDateTime xbirthdate;
    private Integer xblockday;

    private BigDecimal xbonusbal;
    private BigDecimal xbonuspoints;

    private String xbranch;
    private String xcity;
    private String xcode;

    private BigDecimal xcomm;
    private BigDecimal xcomm1;
    private BigDecimal xcomm2;
    private BigDecimal xcomm3;

    private String xcompany;
    private String xcontact;
    private String xcontactphn;
    private String xcountry;

    private BigDecimal xcrlimit;
    private Integer xcrperiod;
    private Integer xcrterms;

    @Lob
    private byte[] xcrtermtype; // varbinary(max)

    private String xcusold;
    private String xcustype;
    private Integer xcycle;

    private LocalDate xdate;
    private LocalDateTime xdateeff;
    private LocalDateTime xdateexp;
    private LocalDate xdatepo;
    private LocalDateTime xdatereject;

    private String xdelicontact;
    private String xdelicontactphn;
    private String xdeliloc;
    private String xdesignation;

    private BigDecimal xdisc;
    private BigDecimal xdiscdet;
    private BigDecimal xdiscdetamt;

    private String xdisctype;
    private String xdistrict;

    private BigDecimal xearnedbonusamt;

    private String xemail;
    private String xemailcomp;

    private BigDecimal xenlistedfee;

    private Integer xexpday;
    private String xexpetriot;

    private String xfax;
    private String xfield;
    private String xfm;
    private String xgcus;
    private String xgsup;
    private String xidsup;
    private String xinvtoinvcr;

    private LocalDate xlastcrdate;

    private String xlicense;
    private String xmadd;
    private String xmarket;
    private String xmeritalstatus;
    private String xmigrationdate;
    private String xmio;
    private String xmobile;
    private String xname;
    private String xoccupation;
    private String xoldcus;
    private String xorg;
    private String xpadd;
    private String xpaymentterm;
    private String xpaymenttype;
    private String xphone;

    private BigDecimal xporamt;

    private String xpostcode;
    private Integer xprdcounter;
    private String xproject;
    private String xref;
    private String xregion;

    private BigDecimal xreqbonuspoints;

    private String xroute;
    private String xrouting;
    private String xsalesperson;

    private BigDecimal xsamtdispat;
    private BigDecimal xsamtjar;

    private String xsex;

    @Column(name = "xshopno", nullable = false)
    private String xshopno;

    private String xsignatory1;
    private String xsignatory2;
    private String xsignatory3;
    private String xsignatory4;
    private String xsignatory5;
    private String xsignatory6;
    private String xsignatory7;

    private LocalDateTime xsigndate1;
    private LocalDateTime xsigndate2;
    private LocalDateTime xsigndate3;
    private LocalDateTime xsigndate4;
    private LocalDateTime xsigndate5;
    private LocalDateTime xsigndate6;
    private LocalDateTime xsigndate7;

    private String xsignreject;
    private String xso;
    private String xsp;
    private String xspouse;
    private String xstaff;
    private String xstatuscus;
    private String xsupcat;
    private String xsuperior2;
    private String xsuperior3;
    private String xsupnewitem;
    private String xterritory;
    private String xthana;
    private String xtin;
    private String xtransshipment;
    private String xtype;
    private String xurl;
    private String xvatdef;
    private String xvatregno;
    private String xwh;

    private String zactive;
    private String zauserid;

    private Integer zid;
    private LocalDateTime ztime;
    private LocalDateTime zutime;
    private String zuuserid;
}
