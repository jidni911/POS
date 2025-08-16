package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "opdodetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Opdodetail {

    @Id
    @Column(name = "xdornum", length = 255, nullable = false)
    private String xdornum;

    @Id
    @Column(name = "xrow", nullable = false)
    private Integer xrow;

    @Column(name = "xaddonrow")
    private Integer xaddonrow;

    @Column(name = "xbnprintstatus", length = 255)
    private String xbnprintstatus;

    @Column(name = "xbonuspoints", precision = 19, scale = 2)
    private BigDecimal xbonuspoints;

    @Column(name = "xchallanitem", length = 255)
    private String xchallanitem;

    @Column(name = "xchange", precision = 19, scale = 2)
    private BigDecimal xchange;

    @Column(name = "xcomm", precision = 19, scale = 2)
    private BigDecimal xcomm;

    @Column(name = "xcomplgiftitem", length = 255)
    private String xcomplgiftitem;

    @Column(name = "xcost", precision = 19, scale = 2)
    private BigDecimal xcost;

    @Column(name = "xdate")
    private LocalDateTime xdate;

    @Column(name = "xdesc", length = 255)
    private String xdesc;

    @Column(name = "xdisc", precision = 19, scale = 2)
    private BigDecimal xdisc;

    @Column(name = "xdiscamt", precision = 19, scale = 2)
    private BigDecimal xdiscamt;

    @Column(name = "xdiscdet", precision = 19, scale = 2)
    private BigDecimal xdiscdet;

    @Column(name = "xdiscdetamt", precision = 19, scale = 2)
    private BigDecimal xdiscdetamt;

    @Column(name = "xdiscdetamttr", precision = 19, scale = 2)
    private BigDecimal xdiscdetamttr;

    @Column(name = "xdiscstatus", length = 255)
    private String xdiscstatus;

    @Column(name = "xdisctype", length = 255)
    private String xdisctype;

    @Column(name = "xdocnum", length = 255)
    private String xdocnum;

    @Column(name = "xdocrow")
    private Integer xdocrow;

    @Column(name = "xdoctype", length = 255)
    private String xdoctype;

    @Column(name = "xdorrow")
    private Integer xdorrow;

    @Column(name = "xgcost", length = 255)
    private String xgcost;

    @Column(name = "xitem", length = 255)
    private String xitem;

    @Column(name = "xlineamt", precision = 19, scale = 2)
    private BigDecimal xlineamt;

    @Column(name = "xlong", length = 255)
    private String xlong;

    @Column(name = "xnetamt", precision = 19, scale = 2)
    private BigDecimal xnetamt;

    @Column(name = "xnetamttr", precision = 19, scale = 2)
    private BigDecimal xnetamttr;

    @Column(name = "xnote", length = 255)
    private String xnote;

    @Column(name = "xpacking", length = 255)
    private String xpacking;

    @Column(name = "xparentitem", length = 255)
    private String xparentitem;

    @Column(name = "xporate", precision = 19, scale = 2)
    private BigDecimal xporate;

    @Column(name = "xpricerow")
    private Integer xpricerow;

    @Column(name = "xpromono", length = 255)
    private String xpromono;

    @Column(name = "xqty")
    private Double xqty;

    @Column(name = "xqtybntr")
    private Integer xqtybntr;

    @Column(name = "xqtybonus", precision = 19, scale = 2)
    private BigDecimal xqtybonus;

    @Column(name = "xqtycrn", precision = 19, scale = 2)
    private BigDecimal xqtycrn;

    @Column(name = "xqtyord", precision = 20, scale = 3)
    private BigDecimal xqtyord;

    @Column(name = "xqtytr")
    private Integer xqtytr;

    @Column(name = "xrate", precision = 19, scale = 2)
    private BigDecimal xrate;

    @Column(name = "xratedisc", precision = 19, scale = 2)
    private BigDecimal xratedisc;

    @Column(name = "xrategrn", precision = 19, scale = 2)
    private BigDecimal xrategrn;

    @Column(name = "xref", length = 255)
    private String xref;

    @Column(name = "xrem", length = 255)
    private String xrem;

    @Column(name = "xretqty")
    private Integer xretqty;

    @Column(name = "xserialnum", length = 255)
    private String xserialnum;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xsprate", precision = 19, scale = 2)
    private BigDecimal xsprate;

    @Column(name = "xstatusap", length = 255)
    private String xstatusap;

    @Column(name = "xstatusgl", length = 255)
    private String xstatusgl;

    @Column(name = "xstatusgrn", length = 255)
    private String xstatusgrn;

    @Column(name = "xstatusjv", length = 255)
    private String xstatusjv;

    @Column(name = "xsupptaxamt", precision = 19, scale = 2)
    private BigDecimal xsupptaxamt;

    @Column(name = "xsupptaxrate", precision = 19, scale = 2)
    private BigDecimal xsupptaxrate;

    @Column(name = "xterminal", length = 255)
    private String xterminal;

    @Column(name = "xtransportamt", precision = 19, scale = 2)
    private BigDecimal xtransportamt;

    @Column(name = "xunit", length = 255)
    private String xunit;

    @Column(name = "xunitsel", length = 255)
    private String xunitsel;

    @Column(name = "xvatamt", precision = 19, scale = 2)
    private BigDecimal xvatamt;

    @Column(name = "xvatamttr", precision = 19, scale = 2)
    private BigDecimal xvatamttr;

    @Column(name = "xvatrate", precision = 19, scale = 2)
    private BigDecimal xvatrate;

    @Column(name = "xworkingdate")
    private LocalDateTime xworkingdate;

    @Column(name = "xwperiod")
    private Integer xwperiod;

    @Column(name = "xwperiodtype", length = 255)
    private String xwperiodtype;

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
