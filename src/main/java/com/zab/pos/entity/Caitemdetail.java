package com.zab.pos.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "caitemdetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Caitemdetail {

    @Id
    @Column(name = "xitem", length = 255, nullable = false)
    private String xitem;

    @Id
    @Column(name = "xsubitem", length = 255, nullable = false)
    private String xsubitem;

    @Id
    @Column(name = "xunit", length = 255, nullable = false)
    private String xunit;

    @Column(name = "xcfpur", precision = 19, scale = 2)
    private BigDecimal xcfpur;

    @Column(name = "xcfsel", precision = 19, scale = 2)
    private BigDecimal xcfsel;

    @Column(name = "xdesc", length = 255)
    private String xdesc;

    @Column(name = "xlong", length = 255)
    private String xlong;

    @Column(name = "xqty", precision = 19, scale = 2)
    private BigDecimal xqty;

    @Column(name = "xrate", precision = 19, scale = 2)
    private BigDecimal xrate;

    @Column(name = "xrow")
    private Integer xrow;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

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
