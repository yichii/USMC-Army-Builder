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
    FireTeamFactory fireTeamFactory = new FireTeamFactory();
    Marine defaultMarine = new Marine("Humprey", Rank.SERGEANT, 25);
    
    public Squad createSquad(String name, Marine squadLeader, List<FireTeam> fireTeams) {
        List<FireTeam> defaultFireTeams = new ArrayList<FireTeam>(List.of(
            fireTeamFactory.createFireTeam("Sigma Squad", null),
            fireTeamFactory.createFireTeam("Foreign Legion", null),
            fireTeamFactory.createFireTeam("Crusade Avenger", null)
        ));
        
        if ((squadLeader == null) && (fireTeams == null)) {
            return new Squad(name, defaultMarine, defaultFireTeams);
        } else if (squadLeader == null) {
            return new Squad(name, defaultMarine, fireTeams);
        } else if (fireTeams == null) {
            return new Squad(name, squadLeader, defaultFireTeams);
        } else {
            return new Squad(name, squadLeader, fireTeams);
        }
    }
}
