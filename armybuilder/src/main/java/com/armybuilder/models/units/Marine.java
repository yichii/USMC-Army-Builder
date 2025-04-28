package com.armybuilder.models.units;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Marine {
    private String name;
    private String rank;
}