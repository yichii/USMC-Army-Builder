package com.armybuilder.factories;

import java.util.*;
import com.armybuilder.enums.Rank;
import com.armybuilder.models.Marine;
import com.armybuilder.models.FireTeam;
/*
 *  The ArmyGenerator class is used as a factory class to generate any army group ranging from a Marine, all the way up to a Platoon. 
 */
public class FireTeamFactory {
    MarineFactory marineFactory = new MarineFactory();
    /**
     * 
     * @param name
     * @param marines
     * @return FireTeam
     */
    public FireTeam createFireTeam(String name, List<Marine> marines) {
        List<Marine> defaultMarines = new ArrayList<Marine>(List.of(
            marineFactory.createMarine("John", "Helldiver", Rank.CORPORAL, 27),
            marineFactory.createMarine("Tau", "Smith", Rank.PRIVATE, 23),
            marineFactory.createMarine("Ron", "Henly", Rank.PRIVATE, 19),
            marineFactory.createMarine("Rabi", "Tex", Rank.PRIVATE, 20)
        ));

        if (marines == null) {
            return new FireTeam(name, defaultMarines);
        } else {
            return new FireTeam(name, marines);
        }
    }
}
