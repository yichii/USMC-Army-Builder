package com.armybuilder;
import com.armybuilder.factories.SquadFactory;
import com.armybuilder.factories.FireTeamFactory;
import com.armybuilder.models.Marine;
import com.armybuilder.models.FireTeam;
import com.armybuilder.models.Squad;

import java.util.ArrayList;
import java.util.List;

import com.armybuilder.enums.Rank;
/*
* Unit Composition: fireteam -> squad -> platoon -> company -> battalion -> regiment -> division
*/
public class App {
    public static void main(String[] args) {
        Marine marine = new Marine("Sergeant", Rank.SERGEANT, 29);
        FireTeamFactory fireTeamFactory = new FireTeamFactory();
        FireTeam fireTeam = fireTeamFactory.createFireTeam(null, null);
        SquadFactory squadFactory = new SquadFactory();
        Squad squad = squadFactory.createSquad("27th", marine, null);
        System.out.println(squad);
        
        Squad squad2 = squadFactory.createSquad("28thth", null, new ArrayList<FireTeam>(List.of(
                    fireTeamFactory.createFireTeam("Sigma Squad", null),
                    fireTeamFactory.createFireTeam("Foreign Legion", null),
                    fireTeamFactory.createFireTeam("Crusade Avenger", null)
                )));
        System.out.println(squad2);

    }
}