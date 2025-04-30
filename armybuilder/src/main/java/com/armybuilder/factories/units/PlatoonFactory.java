package com.armybuilder.factories.units;

import com.armybuilder.factories.headquarters.PlatoonHQFactory;
import com.armybuilder.models.headquarters.PlatoonHQ;
import com.armybuilder.models.units.Platoon;
import com.armybuilder.models.units.Squad;

import java.util.ArrayList;
import java.util.List;

public class PlatoonFactory {
    private final SquadFactory squadFactory = new SquadFactory();
    private final PlatoonHQFactory platoonHQFactory = new PlatoonHQFactory();

    public Platoon createRandomRiflePlatoon() {
        PlatoonHQ riflePlatoonHQ = platoonHQFactory.createRandomRiflePlatoonHQ();
        List<Squad> squads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            squads.add(squadFactory.createRandomSquad());
        }
        return Platoon.builder()
                .squads(squads)
                .platoonHQ(riflePlatoonHQ)
                .build();
    }

    public Platoon createRandomWeaponsPlatoon() {
        PlatoonHQ riflePlatoonHQ = platoonHQFactory.createRandomWeaponsPlatoonHQ();
        List<Squad> sections = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            sections.add(squadFactory.createRandomSquad());
        }
        return Platoon.builder()
                .squads(sections)
                .platoonHQ(riflePlatoonHQ)
                .build();
    }
}
