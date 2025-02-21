package com.armybuilder.factories;
import com.armybuilder.enums.Rank;
import com.armybuilder.models.Marine;

public class MarineFactory {
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
    
}
