package com.armybuilder.factories;

import com.armybuilder.models.Marine;
import com.armybuilder.models.FireTeam;
import java.util.List;
import java.util.ArrayList;

/*
 *  The FireTeamFactory class uses the factory design pattern to generate FireTeams. 
 */
public class FireTeamFactory {
    private final MarineFactory marineFactory = new MarineFactory();

    public FireTeam createRandomFireTeam() {
        List<Marine> marines = new ArrayList<>();
        Marine fireTeamLeader = marineFactory.createRandomMarine(1);
        for (int i = 0; i < 4; i++) {
            marines.add(marineFactory.createRandomMarine(0));
        }
        return FireTeam.builder()
                .marines(marines)
                .teamLeader(fireTeamLeader)
                .build();
    }
}
