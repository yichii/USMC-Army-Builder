package com.armybuilder;

import com.armybuilder.factories.FireTeamFactory;
import com.armybuilder.factories.MarineFactory;
import com.armybuilder.factories.PlatoonFactory;
import com.armybuilder.factories.SquadFactory;

/*
* Unit Composition: fireteam -> squad -> platoon -> company -> battalion -> regiment -> division
*/
public class App {
    public static void main(String[] args) {
        MarineFactory mf = new MarineFactory();
        FireTeamFactory ftf = new FireTeamFactory();
        SquadFactory sf = new SquadFactory();
        PlatoonFactory pf = new PlatoonFactory();
        System.out.println(mf.createRandomMarine());
        System.out.println(ftf.createRandomFireTeam());
        System.out.println(sf.createRandomSquad());
        System.out.println(pf.createRandomPlatoon());


    }
}