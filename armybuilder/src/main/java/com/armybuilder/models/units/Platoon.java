package com.armybuilder.models.units;

import com.armybuilder.models.headquarters.PlatoonHQ;
import java.util.List;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Platoon{
    private List<Squad> squads;
    private PlatoonHQ platoonHQ;
}
