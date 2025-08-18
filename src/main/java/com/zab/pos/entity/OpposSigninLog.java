package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "oppossigninlog")
@IdClass(OpposSigninLogId.class) // composite primary key
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OpposSigninLog {

    @Id
    @Column(name = "xshift", nullable = false, length = 255)
    private String xshift;

    @Id
    @Column(name = "xterminal", nullable = false, length = 255)
    private String xterminal;

    @Id
    @Column(name = "xyearperdate", nullable = false)
    private Integer xyearperdate;

    @Id
    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "xadvposvchr", length = 255)
    private String xadvposvchr;

    @Column(name = "xdate")
    private LocalDateTime xdate;

    @Column(name = "xdiv", length = 255)
    private String xdiv;

    @Column(name = "xrow")
    private Integer xrow;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xstatus", length = 255)
    private String xstatus;

    @Column(name = "xwh", length = 255)
    private String xwh;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "zemail", length = 255)
    private String zemail;

    @Column(name = "zlogintime")
    private LocalDateTime zlogintime;

    @Column(name = "zlogouttime")
    private LocalDateTime zlogouttime;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid", length = 255)
    private String zuuserid;
}
