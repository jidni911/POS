package com.zab.pos.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class XtrnId implements Serializable {
    private String xtrn;
    private String xtypetrn;
}
