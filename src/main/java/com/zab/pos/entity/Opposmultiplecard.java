package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "opposmultiplecard")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Opposmultiplecard {

    @Id
    @Column(name = "xdocrow", nullable = false)
    private Integer xdocrow;

    @Id
    @Column(name = "xdornum", length = 255, nullable = false)
    private String xdornum;

    @Column(name = "xcardamt", precision = 19, scale = 2)
    private BigDecimal xcardamt;

    @Column(name = "xcardno", length = 255)
    private String xcardno;

    @Column(name = "xcardtype", length = 255)
    private String xcardtype;

    @Column(name = "xshopno", length = 255)
    private String xshopno;

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
