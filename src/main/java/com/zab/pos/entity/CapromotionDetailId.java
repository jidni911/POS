package com.zab.pos.entity;


import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CapromotionDetailId implements Serializable {
    private String xpromono;
    private Integer xrow;
    private Integer zid;
}
