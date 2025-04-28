package com.armybuilder.factories.units.platoons;

import com.armybuilder.factories.headquarters.PlatoonHQFactory;
import com.armybuilder.factories.units.SquadFactory;
import com.armybuilder.models.headquarters.PlatoonHQ;
import com.armybuilder.models.units.Platoon;
import com.armybuilder.models.units.Squad;

import java.util.ArrayList;
import java.util.List;

public class RiflePlatoon {
    private final SquadFactory squadFactory = new SquadFactory();
    private final PlatoonHQFactory platoonHQFactory = new PlatoonHQFactory();

    public Platoon createRandomPlatoon() {
        List<Squad> squads = new ArrayList<>();
        PlatoonHQ platoonHQ = platoonHQFactory.createRandomPlatoonHQ();

        for (int i = 0; i < 4; i++) {
            squads.add(squadFactory.createRandomSquad());
        }
        return Platoon.builder()
                .squads(squads)
                .platoonHQ(platoonHQ)
                .build();
    }
}
