package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "opworkingperiod")
@Getter
@Setter
public class OpWorkingPeriod {

    @Id
    @Column(name = "xworkingday", nullable = false)
    private LocalDateTime xworkingday;   // PK

    @Column(name = "xdate")
    private LocalDateTime xdate;

    @Column(name = "xendtime")
    private LocalTime xendtime;

    @Column(name = "xrow")
    private Integer xrow;

    @Column(name = "xshopno")
    private String xshopno;

    @Column(name = "xstarttime")
    private LocalTime xstarttime;

    @Column(name = "zauserid")
    private String zauserid;

    @Column(name = "zid")
    private Integer zid;

    @Column(name = "ztime")
    private LocalDateTime ztime;

    
}
