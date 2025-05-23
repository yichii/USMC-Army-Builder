package com.armybuilder.factories.units;

import com.armybuilder.models.units.Marine;
import com.armybuilder.models.units.FireTeam;
import com.armybuilder.models.units.Squad;
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
        Marine squadLeader = marineFactory.createRandomMarine(4);
        for (int i = 0; i < 4; i++) {
            fireTeams.add(fireTeamFactory.createRandomFireTeam());
        }
        return Squad.builder()
                .fireTeams(fireTeams)
                .squadLeader(squadLeader)
                .build();
    }

    public Squad createRandomMMGSquad() {
        List<FireTeam> fireTeams = new ArrayList<>();
        Marine squadLeader = marineFactory.createRandomMarine(4);
        for (int i = 0; i < 3; i++) {
            fireTeams.add(fireTeamFactory.createRandomMMGFireTeam());
        }
        return Squad.builder()
                .fireTeams(fireTeams)
                .squadLeader(squadLeader)
                .build();
    }

    public Squad createRandomMortarSquad() {
        List<Marine> marines = new ArrayList<>();
        Marine squadLeader = marineFactory.createRandomMarine(3);
        for (int i = 0; i < 3; i++) {
            marines.add(marineFactory.createRandomMarine());
        }
        return Squad.builder()
                .fireTeams(marines)
                .squadLeader(squadLeader)
                .build();
    }

    public Squad createRandomAssaultSquad() {
        List<Marine> fireTeams = new ArrayList<>();
        Marine squadLeader = marineFactory.createRandomMarine(3);
        for (int i = 0; i < 3; i++) {
            fireTeams.add(marineFactory.createRandomMarine());
        }
        return Squad.builder()
                .fireTeams(fireTeams)
                .squadLeader(squadLeader)
                .build();
    }
}
