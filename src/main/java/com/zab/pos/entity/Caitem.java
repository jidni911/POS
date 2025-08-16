package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "caitem")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Caitem {

    @Id
    @Column(name = "xitem", nullable = false, length = 255)
    private String xitem;

    @Column(name = "hscode")
    private String hscode;

    @Column(name = "xalias")
    private String xalias;

    @Column(name = "xautogrn")
    private String xautogrn;

    @Column(name = "xbimage")
    private String xbimage;

    @Column(name = "xbin")
    private String xbin;

    @Column(name = "xbnprintstatus")
    private String xbnprintstatus;

    @Column(name = "xbodycode")
    private String xbodycode;

    @Column(name = "xbrand")
    private String xbrand;

    @Column(name = "xcartoon")
    private BigDecimal xcartoon;

    @Column(name = "xcatitem")
    private String xcatitem;

    @Column(name = "xcfiss")
    private BigDecimal xcfiss;

    @Column(name = "xcfpck")
    private BigDecimal xcfpck;

    @Column(name = "xcfpur")
    private BigDecimal xcfpur;

    @Column(name = "xcfsel")
    private BigDecimal xcfsel;

    @Column(name = "xcitem")
    private String xcitem;

    @Column(name = "xcodeold")
    private String xcodeold;

    @Column(name = "xcost")
    private BigDecimal xcost;

    @Column(name = "xcountry")
    private String xcountry;

    @Column(name = "xcus")
    private String xcus;

    @Column(name = "xdatecreate")
    private LocalDateTime xdatecreate;

    @Column(name = "xdateeff")
    private LocalDateTime xdateeff;

    @Column(name = "xdateexp")
    private LocalDateTime xdateexp;

    @Column(name = "xdealerp")
    private BigDecimal xdealerp;

    @Column(name = "xdesc")
    private String xdesc;

    @Column(name = "xdisc")
    private BigDecimal xdisc;

    @Column(name = "xdiscstatus")
    private String xdiscstatus;

    @Column(name = "xdisctype")
    private String xdisctype;

    @Column(name = "xdornum")
    private String xdornum;

    @Column(name = "xendtime")
    private LocalTime xendtime;

    @Column(name = "xgitem")
    private String xgitem;

    @Column(name = "xgrade")
    private String xgrade;

    @Column(name = "xgritem")
    private String xgritem;

    @Column(name = "xhscode")
    private String xhscode;

    @Column(name = "xitemdept")
    private String xitemdept;

    @Column(name = "xitemsubdept")
    private String xitemsubdept;

    @Column(name = "xlmax")
    private BigDecimal xlmax;

    @Column(name = "xlmin")
    private BigDecimal xlmin;

    @Column(name = "xlong")
    private String xlong;

    @Column(name = "xminqty")
    private BigDecimal xminqty;

    @Column(name = "xmodel")
    private String xmodel;

    @Column(name = "xmrp")
    private BigDecimal xmrp;

    @Column(name = "xpacking")
    private String xpacking;

    @Column(name = "xpackqty")
    private BigDecimal xpackqty;

    @Column(name = "xpackweightnet")
    private BigDecimal xpackweightnet;

    @Column(name = "xpartno")
    private String xpartno;

    @Column(name = "xpnature")
    private String xpnature;

    @Column(name = "xpsize")
    private String xpsize;

    @Column(name = "xrate")
    private BigDecimal xrate;

    @Column(name = "xrateexp")
    private BigDecimal xrateexp;

    @Column(name = "xreordlvl")
    private BigDecimal xreordlvl;

    @Column(name = "xsdcat")
    private String xsdcat;

    @Column(name = "xserialnum")
    private String xserialnum;

    @Column(name = "xserialtype")
    private String xserialtype;

    @Column(name = "xsetmenustatus")
    private String xsetmenustatus;

    @Column(name = "xshelf")
    private String xshelf;

    @Column(name = "xshopno")
    private String xshopno;

    @Column(name = "xspecification")
    private String xspecification;

    @Column(name = "xstarttime")
    private LocalTime xstarttime;

    @Column(name = "xstype")
    private String xstype;

    @Column(name = "xsubcat")
    private String xsubcat;

    @Column(name = "xsupptaxamt")
    private BigDecimal xsupptaxamt;

    @Column(name = "xsupptaxrate")
    private BigDecimal xsupptaxrate;

    @Column(name = "xtaxrate")
    private BigDecimal xtaxrate;

    @Column(name = "xtheircode")
    private String xtheircode;

    @Column(name = "xtitem")
    private String xtitem;

    @Column(name = "xtype")
    private String xtype;

    @Column(name = "xtypeitem")
    private String xtypeitem;

    @Column(name = "xunit")
    private String xunit;

    @Column(name = "xunitiss")
    private String xunitiss;

    @Column(name = "xunitpck")
    private String xunitpck;

    @Column(name = "xunitpur")
    private String xunitpur;

    @Column(name = "xunitsel")
    private String xunitsel;

    @Column(name = "xvatamt")
    private BigDecimal xvatamt;

    @Column(name = "xvatcat")
    private String xvatcat;

    @Column(name = "xvatrate")
    private BigDecimal xvatrate;

    @Column(name = "xwper")
    private Integer xwper;

    @Column(name = "zactive")
    private String zactive;

    @Column(name = "zauserid")
    private String zauserid;

    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid")
    private String zuuserid;
}
