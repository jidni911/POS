package com.zab.pos.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class XtrnpId implements Serializable {
    private String xtrn;
    private String xtyperel;
    private String xtypetrn;
}
