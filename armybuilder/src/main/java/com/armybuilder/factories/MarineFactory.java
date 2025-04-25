package com.armybuilder.factories;

import com.armybuilder.enums.Rank;
import com.armybuilder.models.Marine;

import java.util.List;
import java.util.Random;

/*
 *  The MarineFactory class uses the factory design pattern to generate Marines.
 */
public class MarineFactory {
    private final Random random = new Random();
    private static final List<String> NAMES = List.of("Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin",
            "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson",
            "Walker", "Young", "Allen", "King", "Wright", "Scott", "Torres", "Nguyen", "Hill", "Flores",
            "Green", "Adams", "Nelson", "Baker", "Hall", "Rivera", "Campbell", "Mitchell", "Carter", "Roberts"
    );
    private static final List<String> RANKS = List.of("Pvt", "Cpl", "Sgt", "Lt", "Cpt", "Lt Col", "Col", "Maj Gen", "Cmdt");

    public Marine createRandomMarine() {
        String name = NAMES.get(random.nextInt(NAMES.size()));
        String rank = RANKS.get(random.nextInt(RANKS.size()));
        return Marine.builder()
                .name(name)
                .rank(rank)
                .build();
    }
}
