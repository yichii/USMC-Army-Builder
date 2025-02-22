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
    Marine defaultSquadLeader = new Marine("Humprey", Rank.SERGEANT, 25);
    List<FireTeam> defaultFireTeams = new ArrayList<FireTeam>(List.of(
            fireTeamFactory.createFireTeam("Sigma Squad", null),
            fireTeamFactory.createFireTeam("Foreign Legion", null),
            fireTeamFactory.createFireTeam("Crusade Avenger", null)
        ));
    
    /**
     * 
     * @param name
     * @param squadLeader
     * @param fireTeams
     * @return
     */
    public Squad createSquad(String name, Marine squadLeader, List<FireTeam> fireTeams) { 
        return new Squad(name, squadLeader, fireTeams);
    }

    /**
     * 
     * @param squadLeader
     * @param fireTeams
     * @return A squad with a default name("Squad")
     */
    public Squad createSquad(Marine squadLeader, List<FireTeam> fireTeams) {
        return new Squad(squadLeader, fireTeams);
    }

    /**
     * 
     * @param name
     * @return A squad with a default squad leader and fire teams
     */
    public Squad createSquad(String name) {
        return new Squad(name, defaultSquadLeader, defaultFireTeams);
    }

    /**
     * 
     * @param name
     * @param squadLeader
     * @return A squad with default fire teams
     */
    public Squad createSquad(String name, Marine squadLeader) {
        return new Squad(name, squadLeader, defaultFireTeams);
    }
    
    /**
     * 
     * @param name
     * @param fireTeams
     * @return A squad with a default squad leader
     */
    public Squad createSquad(String name, List<FireTeam> fireTeams) {
        return new Squad(name, defaultSquadLeader, defaultFireTeams);
    }
}
