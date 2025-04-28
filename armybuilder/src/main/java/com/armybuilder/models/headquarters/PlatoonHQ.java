package com.armybuilder.models.headquarters;

import com.armybuilder.models.units.Marine;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlatoonHQ {
    private List<Marine> platoonHQPersonnel;
}
