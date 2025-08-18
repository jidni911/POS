package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "xroles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Xroles {

    @Id
    @Column(name = "xrole", nullable = false, length = 255)
    private String xrole;

    @Column(name = "xaccess", length = 255)
    private String xaccess;

    @Column(name = "xdesc", length = 255)
    private String xdesc;

    @Column(name = "xmaxdisc", precision = 19, scale = 2)
    private BigDecimal xmaxdisc;

    @Column(name = "xmaxdiscf", precision = 19, scale = 2)
    private BigDecimal xmaxdiscf;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "zactive", length = 255)
    private String zactive;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid", length = 255)
    private String zuuserid;
}
