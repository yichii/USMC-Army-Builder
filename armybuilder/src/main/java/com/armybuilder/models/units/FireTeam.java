package com.armybuilder.models.units;

import java.util.List;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class FireTeam{
    private List<Marine> marines;
    private Marine teamLeader;
}
