package com.armybuilder.factories;
import com.armybuilder.enums.Rank;
import com.armybuilder.models.Marine;
import com.armybuilder.models.FireTeam;
import com.armybuilder.models.Squad;
import java.util.List;
import java.util.ArrayList;

/*
 *  The SquadFactory class uses the factory design pattern to generate Squads. 
 */
public class SquadFactory {
    private final FireTeamFactory fireTeamFactory = new FireTeamFactory();
    private final MarineFactory marineFactory = new MarineFactory();

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
