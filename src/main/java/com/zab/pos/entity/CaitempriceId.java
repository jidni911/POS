package com.zab.pos.entity;


import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaitempriceId implements Serializable {
    private String xitem;
    private Integer xrow;
}
