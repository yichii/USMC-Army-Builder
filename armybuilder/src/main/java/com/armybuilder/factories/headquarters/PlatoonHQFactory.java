package com.armybuilder.factories.headquarters;

import com.armybuilder.factories.units.MarineFactory;
import com.armybuilder.models.units.Marine;
import com.armybuilder.models.headquarters.PlatoonHQ;
import java.util.ArrayList;
import java.util.List;

public class PlatoonHQFactory {
    private final MarineFactory marineFactory = new MarineFactory();

    public PlatoonHQ createRandomPlatoonHQ() {
        List<Marine> platoonHQPersonnel = new ArrayList<>();
        platoonHQPersonnel.add(marineFactory.createRandomMarine(16, 18));
        platoonHQPersonnel.add(marineFactory.createRandomMarine(5));
        platoonHQPersonnel.add(marineFactory.createRandomMarine(0, 4));
        return PlatoonHQ.builder()
                .platoonHQPersonnel(platoonHQPersonnel)
                .build();
    }
}
