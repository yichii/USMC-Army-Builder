package com.armybuilder.factories.units;

import com.armybuilder.models.units.Marine;
import com.armybuilder.models.units.FireTeam;
import java.util.List;
import java.util.ArrayList;

public class FireTeamFactory {
    private final MarineFactory marineFactory = new MarineFactory();

    /**
     *
     * @return A random fire team with a team leader that is ranked as a Corporal
     */
    public FireTeam createRandomFireTeam() {
        List<Marine> marines = new ArrayList<>();
        Marine fireTeamLeader = marineFactory.createRandomMarine(3);
        for (int i = 0; i < 4; i++) {
            marines.add(marineFactory.createRandomMarine(0));
        }
        return FireTeam.builder()
                .marines(marines)
                .teamLeader(fireTeamLeader)
                .build();
    }

    public FireTeam createRandomMMGFireTeam() {
        List<Marine> marines = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            marines.add(marineFactory.createRandomMarine(i));
        }
        return FireTeam.builder()
                .marines(marines)
                .teamLeader(null)
                .build();
    }

    public FireTeam createRandomAssaultFireTeam() {
        List<Marine> marines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            marines.add(marineFactory.createRandomMarine(i));
        }
        return FireTeam.builder()
                .marines(marines)
                .teamLeader(null)
                .build();
    }
}
