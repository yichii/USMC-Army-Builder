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
        
        // Creating a list of marines in order to add for each fire team
        List<Marine> marines = new ArrayList<Marine>();
        marines.add(marine1);
        marines.add(marine2);
        marines.add(marine3);
        marines.add(marine4);

        // Creating a squad
        Squad squad = new Squad("Delta Squad", new Marine("Rambo", Rank.SERGEANT, 45));

        // Adding the fire team to the squad
        squad.addFireTeam("Limma", marines);
        squad.addFireTeam("Charlie", marines);
        squad.addFireTeam("Omega", marines);
        System.out.println(squad);

        squad.changeSquadLeager(new Marine("Ray", "Machine Gun", Rank.PRIVATE, 45));
        System.out.println(squad);
    }
}
