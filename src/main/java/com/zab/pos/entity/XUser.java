package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "xusers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class XUser {

    @Id
    @Column(name = "zemail", nullable = false, length = 255)
    private String zemail;

    @Column(name = "xaccess", length = 255)
    private String xaccess;

    @Column(name = "xdformat", length = 255)
    private String xdformat;

    @Column(name = "xdsep", length = 255)
    private String xdsep;

    @Column(name = "xlastlogdate")
    private LocalDateTime xlastlogdate;

    @Column(name = "xname", length = 255)
    private String xname;

    @Column(name = "xoldpass", length = 255)
    private String xoldpass;

    @Column(name = "xpassword", length = 255)
    private String xpassword;

    @Column(name = "xposition", length = 255)
    private String xposition;

    @Column(name = "xpriority", length = 255)
    private String xpriority;

    @Column(name = "xrole", length = 255)
    private String xrole;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xsp", length = 255)
    private String xsp;

    @Column(name = "xwh", length = 255)
    private String xwh;

    @Column(name = "zactive", length = 255)
    private String zactive;

    @Column(name = "zaip", length = 255)
    private String zaip;

    @Column(name = "zauserid", length = 255)
    private String zauserid;

    @Column(name = "zid")
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
