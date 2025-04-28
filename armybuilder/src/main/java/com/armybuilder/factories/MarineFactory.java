package com.armybuilder.factories;

import com.armybuilder.models.Marine;
import java.util.List;
import java.util.Random;

public class MarineFactory {
    private static final List<String> NAMES = List.of("Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin",
            "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson",
            "Walker", "Young", "Allen", "King", "Wright", "Scott", "Torres", "Nguyen", "Hill", "Flores",
            "Green", "Adams", "Nelson", "Baker", "Hall", "Rivera", "Campbell", "Mitchell", "Carter", "Roberts"
    );
    private static final List<String> RANKS = List.of("Pvt", "PFC", "LCpl", "Cpl", "Sgt", "SSgt", "GySgt", "MSgt", "1stSg", "MGySg", "SgtMa", "WO1", "CW2", "CW3", "CW4", "CW5", "2ndLt", "1stLt", "Capt", "Maj", "LtCol", "Col", "BGen", "MajGen", "LtGen", "Gen");
    private final Random random = new Random();

    /**
     *
     * @return A random marine with a random rank and random name
     */
    public Marine createRandomMarine() {
        String name = NAMES.get(random.nextInt(NAMES.size()));
        String rank = RANKS.get(random.nextInt(RANKS.size()));
        return Marine.builder()
                .name(name)
                .rank(rank)
                .build();
    }

    /**
     *
     * @param desiredRank From 0 to 8 with 0 being Private and 8 being Commandant
     * @return A random marine with a chosen rank and a random name
     */
    public Marine createRandomMarine(int desiredRank) {
        String name = NAMES.get(random.nextInt(NAMES.size()));
        String rank = RANKS.get(desiredRank);
        return Marine.builder()
                .name(name)
                .rank(rank)
                .build();
    }
}
