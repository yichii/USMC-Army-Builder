package com.armybuilder.factories.headquarters;

import com.armybuilder.factories.MarineFactory;
import com.armybuilder.models.Marine;
import com.armybuilder.models.headquarters.PlatoonHQ;
import java.util.ArrayList;
import java.util.List;

public class PlatoonHQFactory {
    private final MarineFactory marineFactory = new MarineFactory();

    public PlatoonHQ createRandomPlatoonHQ() {
        List<Marine> platoonHQPersonnel = new ArrayList<>();
        platoonHQPersonnel.add(marineFactory.createRandomMarine(16));
        platoonHQPersonnel.add(marineFactory.createRandomMarine(8));
        platoonHQPersonnel.add(marineFactory.createRandomMarine());
        return PlatoonHQ.builder()
                .platoonHQPersonnel(platoonHQPersonnel)
                .build();
    }
}
