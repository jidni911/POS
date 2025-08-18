package com.zab.pos.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class XRolePrivilegeId implements Serializable {
    private String xrole;
    private String zscreen;
}
