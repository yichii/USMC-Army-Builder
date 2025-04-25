package com.armybuilder.factories;

import com.armybuilder.models.Marine;
import com.armybuilder.models.FireTeam;
import com.armybuilder.models.Squad;
import java.util.List;
import java.util.ArrayList;

public class SquadFactory {
    private final FireTeamFactory fireTeamFactory = new FireTeamFactory();
    private final MarineFactory marineFactory = new MarineFactory();

    /**
     *
     * @return A random squad with a squad leader that is ranked as a Sergeant
     */
    public Squad createRandomSquad() {
        List<FireTeam> fireTeams = new ArrayList<>();
        Marine squadLeader = marineFactory.createRandomMarine(2);
        for (int i = 0; i < 4; i++) {
            fireTeams.add(fireTeamFactory.createRandomFireTeam());
        }
        return Squad.builder()
                .fireTeams(fireTeams)
                .squadLeader(squadLeader)
                .build();
    }
}
