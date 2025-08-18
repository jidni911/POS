package com.zab.pos.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "xroleprivilege")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(XRolePrivilegeId.class)
public class XRolePrivilege {

    @Id
    @Column(name = "xrole", nullable = false, length = 255)
    private String xrole;

    @Id
    @Column(name = "zscreen", nullable = false, length = 255)
    private String zscreen;

    @Column(name = "xfields", length = 255)
    private String xfields;

    @Column(name = "xoption", length = 255)
    private String xoption;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

    @Column(name = "xtype", length = 255)
    private String xtype;

    @Column(name = "zactive", nullable = false, length = 255)
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
