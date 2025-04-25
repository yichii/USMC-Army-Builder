package com.armybuilder.models;

import com.armybuilder.enums.Rank;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Marine {
    private String name;
    private String rank;
}