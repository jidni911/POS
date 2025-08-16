package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "arhed")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Arhed {

    @Id
    @Column(name = "xvoucher", length = 255, nullable = false)
    private String xvoucher;

    @Id
    @Column(name = "zid", nullable = false)
    private Integer zid;

    private BigDecimal xait;
    private BigDecimal xaitamt;
    private BigDecimal xavlperc;
    private BigDecimal xbalbase;
    private BigDecimal xbalprime;
    private BigDecimal xbalprimebuyer;

    private String xbank;
    private String xbankcon;

    private BigDecimal xbase;

    private String xbillno;
    private String xbsn;
    private String xcheque;

    private LocalDate xchequecondate;
    private LocalDate xchequedate;

    private BigDecimal xchgsbase;
    private BigDecimal xchgsprime;

    private String xcur;
    private String xcurbuyer;
    private String xcus;

    private LocalDateTime xdate;
    private LocalDateTime xdatedue;
    private LocalDateTime xdateref;

    private BigDecimal xdiscbase;
    private BigDecimal xdiscprime;

    private String xdiv;
    private String xdocnum;
    private String xdocnumcheq;
    private String xdornum;

    private BigDecimal xexch;
    private BigDecimal xexchbuyer;

    private LocalDateTime xfbpdate;
    private String xfbpno;

    private LocalDateTime xfdbcdate;
    private String xfdbcno;

    private String xfm;
    private String xgrnnum;
    private String xlcno;

    private LocalDate xmaturitydate;

    private String xnote;
    private String xordernum;
    private String xpaymentterm;
    private String xpaymenttype;
    private String xpiref;
    private String xpornum;
    private String xpp;

    private BigDecimal xprime;
    private BigDecimal xprimebuyer;
    private BigDecimal xprimelcvalue;
    private BigDecimal xprnamt;

    private String xref;
    private String xrem;
    private String xrsm;
    private String xshopno;

    private Integer xsign;
    private String xsm;
    private String xsp;
    private String xstatusbnk;
    private String xstatuschq;
    private String xstatusjv;
    private String xsub;

    private BigDecimal xtotamt;

    private String xtype;
    private String xtypeadj;
    private String xtypeobj;
    private String xtyperec;
    private String xtypetrn;

    private BigDecimal xvatamt;
    private BigDecimal xvatrate;

    private String xwh;
    private String zauserid;

    private LocalDateTime ztime;
    private LocalDateTime zutime;

    private String zuuserid;
}
