package com.zab.pos.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpposSigninLogId implements Serializable {
    private String xshift;
    private String xterminal;
    private Integer xyearperdate;
    private Integer zid;
}
