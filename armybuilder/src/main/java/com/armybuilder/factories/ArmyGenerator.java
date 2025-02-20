package com.armybuilder.factories;

import java.util.*;
import com.armybuilder.enums.Rank;
import com.armybuilder.models.*;
/*
 *  The ArmyGenerator class is used as a factory class to generate any army group ranging from a Marine, all the way up to a Platoon. 
 */
public class ArmyGenerator {
    /**
     * 
     * @param firstName
     * @param lastName
     * @param rank
     * @param age
     * @return Marine
     */
    public Marine createMarine(String firstName, String lastName, Rank rank, int age) {
        return new Marine(firstName, lastName, rank, age);
    }

    /**
     * 
     * @param firstName
     * @param rank
     * @param age
     * @return Marine with default last name(N/A)
     */
    public Marine createMarine(String firstName, Rank rank, int age) {
        return new Marine(firstName, rank, age);
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @return Marine with default rank(Private)
     */
    public Marine createMarine(String firstName, String lastName, int age) {
        return new Marine(firstName, lastName, age);
    }

    /**
     * 
     * @param name
     * @param marines
     * @return FireTeam
     */
    public FireTeam createFireTeam(String name, List<Marine> marines) {
        List<Marine> defaultMarines = new ArrayList<Marine>(List.of(
            this.createMarine("John", "Helldiver", Rank.CORPORAL, 27),
            this.createMarine("Tau", "Smith", Rank.PRIVATE, 23),
            this.createMarine("Ron", "Henly", Rank.PRIVATE, 19),
            this.createMarine("Rabi", "Tex", Rank.PRIVATE, 20)
        ));

        if (marines == null) {
            return new FireTeam(name, defaultMarines);
        } else {
            return new FireTeam(name, marines);
        }
    }
}
