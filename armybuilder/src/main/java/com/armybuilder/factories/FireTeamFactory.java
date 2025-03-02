package com.armybuilder.factories;
import com.armybuilder.enums.Rank;
import com.armybuilder.models.Marine;
import com.armybuilder.models.FireTeam;
import java.util.List;
import java.util.ArrayList;

/*
 *  The FireTeamFactory class uses the factory design pattern to generate FireTeams. 
 */
public class FireTeamFactory {
    MarineFactory marineFactory = new MarineFactory();
    List<Marine> defaultMarines = new ArrayList<Marine>(List.of(
        marineFactory.createMarine("John", "Helldiver", Rank.CORPORAL, 27),
        marineFactory.createMarine("Tau", "Smith", Rank.PRIVATE, 23),
        marineFactory.createMarine("Ron", "Henly", Rank.PRIVATE, 19),
        marineFactory.createMarine("Rabi", "Tex", Rank.PRIVATE, 20)
    ));

    /**
     * 
     * @param name
     * @param marines
     * @return FireTeam
     */
    public FireTeam createFireTeam(String name, List<Marine> marines) {
        return new FireTeam(name, marines);
    }

    /**
     * 
     * @param marines
     * @return FireTeam with default name("FireTeam")
     */
    public FireTeam createFireTeam(List<Marine> marines) {
        return new FireTeam(marines);
    }

    /**
     * 
     * @param name
     * @return A fireteam with default marines.
     */
    public FireTeam createFireTeam(String name) {
        return new FireTeam(name, defaultMarines);
    }
}
