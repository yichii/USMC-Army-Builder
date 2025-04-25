package com.armybuilder.factories;

import com.armybuilder.factories.headquarters.PlatoonHQFactory;
import com.armybuilder.models.Platoon;
import com.armybuilder.models.Marine;
import com.armybuilder.models.Squad;
import com.armybuilder.models.headquarters.Headquarters;

import java.util.ArrayList;
import java.util.List;

public class PlatoonFactory {
    private final SquadFactory squadFactory = new SquadFactory();
    private final PlatoonHQFactory platoonHQFactory = new PlatoonHQFactory();

    public Platoon createRandomPlatoon() {
        List<Squad> squads = new ArrayList<>();
        PlatoonHQFactory platoonHQ = platoonHQFactory.createRandomHQ());

        for (int i = 0; i < 4; i++) {
            squads.add(squadFactory.createRandomSquad());
        }
        return Platoon.builder()
                .squads(squads)
                .platoonHQ(platoonHQ)
                .build();
    }
}
