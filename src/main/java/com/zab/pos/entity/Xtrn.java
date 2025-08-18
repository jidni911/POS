package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "xtrn")
@IdClass(XtrnId.class) // Composite key class
public class Xtrn {

    @Id
    @Column(name = "xtrn", nullable = false, length = 255)
    private String xtrn;

    @Id
    @Column(name = "xtypetrn", nullable = false, length = 255)
    private String xtypetrn;

    @Column(name = "xaction", length = 255)
    private String xaction;

    @Column(name = "xcollector", length = 255)
    private String xcollector;

    @Column(name = "xdesc", length = 255)
    private String xdesc;

    @Column(name = "xinc")
    private Integer xinc;

    @Column(name = "xnum")
    private Integer xnum;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xunit", length = 255)
    private String xunit;

    @Column(name = "xwh", length = 255)
    private String xwh;

    @Column(name = "zactive", length = 255)
    private String zactive;

    @Column(name = "zaip", length = 255)
    private String zaip;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "zid", nullable = false)
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    @Column(name = "zuip", length = 255)
    private String zuip;

    @Column(name = "zutime")
    private LocalDateTime zutime;

    @Column(name = "zuuserid", length = 255)
    private String zuuserid;
}
