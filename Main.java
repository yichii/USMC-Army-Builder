import java.util.*;
/*
* Still need to implement: platoon class, company class, batallion class, regiment class, division class
*/
public class Main {
    public static void main(String[] args) {
        // Creating Army Generator
        ArmyGenerator armyGenerator = new ArmyGenerator();

        // Creating each marine
        Marine marine5 = armyGenerator.createMarine("Rambo", Rank.LIEUTENANT, 45);
        Marine marine6 = armyGenerator.createMarine("Ray", "Machine Gun", Rank.SERGEANT, 45);
        Marine marine7 = armyGenerator.createMarine("Arthur", "Gun", Rank.SERGEANT, 45);
        
        // Creating a squad
        Squad squad = new Squad("Delta Squad", marine5, new ArrayList<FireTeam>(List.of(
            armyGenerator.createFireTeam("Limma", null), 
            armyGenerator.createFireTeam("Charlie", null), 
            armyGenerator.createFireTeam("Omega", null)
        )));
        
        // Adding the fire team to the squad

        System.out.println(squad);
        
        // Creating a platoon
        Platoon platoon = new Platoon("1st Platoon", new Headquarters(null, marine5, marine6, marine7));
        platoon.addSquad(squad);
        platoon.addSquad(squad);
        platoon.addSquad(squad);
        System.out.println(platoon);
        
        /* Dilemma: How do we create a platoon that has a squad to be part of it(composition) while also having the fire teams to be part of each
        * individual squad(composition). How do we do this?
        * Possible solution #1: have it so you create a squad with the fireteams already intact. We do this by opting for adding a fire team through the
        * constructor rather through the addFireTeam method. 
        * 
        * Drawback: adding a squad will be really cluttered.
        * 
        */
        
    }
}
