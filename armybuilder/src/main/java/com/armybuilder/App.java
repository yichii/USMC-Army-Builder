package com.armybuilder;

import com.armybuilder.factories.units.FireTeamFactory;
import com.armybuilder.factories.units.MarineFactory;
import com.armybuilder.factories.units.platoons.RiflePlatoon;
import com.armybuilder.factories.units.SquadFactory;

/*
* Unit Composition: fireteam -> squad -> platoon -> company -> battalion -> regiment -> division
*/
public class App {
    public static void main(String[] args) {
        MarineFactory mf = new MarineFactory();
        FireTeamFactory ftf = new FireTeamFactory();
        SquadFactory sf = new SquadFactory();
        RiflePlatoon pf = new RiflePlatoon();
        System.out.println(mf.createRandomMarine());
        System.out.println(ftf.createRandomFireTeam());
        System.out.println(sf.createRandomSquad());
        //System.out.println(pf.createRandomPlatoon());


    }
}