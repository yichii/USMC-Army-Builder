package com.armybuilder;

import com.armybuilder.models.Company;
import com.armybuilder.models.platoon.Platoon;
import com.armybuilder.models.headquarters.CompanyHeadquarters;
import com.armybuilder.models.headquarters.Headquarters;
import com.armybuilder.models.Marine;
import com.armybuilder.enums.Rank;
import com.armybuilder.factories.MarineFactory;
import com.armybuilder.factories.SquadFactory;
/*
* Unit Composition: fireteam -> squad -> platoon -> company -> battalion -> regiment -> division
*/
public class App {
    public static void main(String[] args) {
        MarineFactory marineFactory = new MarineFactory();
        Marine marine = marineFactory.createMarine("Johnny", "Helldiver", Rank.COMMANDER, 25);
        Headquarters headquarters = new Headquarters(null, marine, marine, marine);
        SquadFactory squadFactory = new SquadFactory();
        squadFactory.createSquad("Deathwatch", marine, null);
        Platoon platoon = new Platoon(headquarters);

    }
}