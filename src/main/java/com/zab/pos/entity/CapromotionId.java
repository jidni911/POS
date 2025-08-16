package com.zab.pos.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CapromotionId implements Serializable {
    private String xpromono;
    private Integer zid;
}
