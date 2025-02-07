import java.util.*;
/*
* Still need to implement: platoon class, company class, batallion class, regiment class, division class
*/
public class Main {
    public static void main(String[] args) {
        // Creating each marine
        Marine marine1 = new Marine("John", "Marine", Rank.CORPORAL, 24);
        Marine marine2 = new Marine("Mart", "HellDiver", Rank.PRIVATE, 19);
        Marine marine3 = new Marine("Rambo", "Cena", Rank.PRIVATE, 18);
        Marine marine4 = new Marine("Steve", "Wojak", Rank.PRIVATE, 20);
        Marine marine5 = new Marine("Rambo", Rank.LIEUTENANT, 45);
        Marine marine6 = new Marine("Ray", "Machine Gun", Rank.SERGEANT, 45);
        Marine marine7 = new Marine("Arthur", "Gun", Rank.SERGEANT, 45);
        
        // Creating a list of marines in order to add for each fire team
        List<Marine> marines = new ArrayList<Marine>();
        marines.add(marine1);
        marines.add(marine2);
        marines.add(marine3);
        marines.add(marine4);

        // Creating a squad
        Squad squad = new Squad("Delta Squad", marine5);

        // Adding the fire team to the squad
        squad.addFireTeam("Limma", marines);
        squad.addFireTeam("Charlie", marines);
        squad.addFireTeam("Omega", marines);
        System.out.println(squad);

        squad.changeSquadLeager(marine6);
        System.out.println(squad);

        // Creating a platoon
        Platoon platoon = new Platoon("1st Platoon", new Headquarters(null, marine5, marine6, marine7));
        platoon.addSquad(null, null);
    }
}
