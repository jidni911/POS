package com.zab.pos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class XcodesId implements Serializable {

    @Column(name = "xcode", nullable = false)
    private String xcode;

    @Column(name = "xtype", nullable = false)
    private String xtype;
}
