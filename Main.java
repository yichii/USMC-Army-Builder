import java.util.*;

public class Main {
    public static void main(String[] args) {
        Marine marine1 = new Marine("John", "Marine", Rank.SERGEANT, 24);
        Marine marine2 = new Marine("John", "HellDiver", Rank.PRIVATE, 19);
        Marine marine3 = new Marine("Rambo", "Cena", Rank.PRIVATE, 18);
        Marine marine4 = new Marine("Steve", "Wojak", Rank.PRIVATE, 20);
        List<Marine> marines = new ArrayList<Marine>();
        marines.add(marine1);
        marines.add(marine2);
        marines.add(marine3);
        marines.add(marine4);
        FireTeam fireTeam = new FireTeam("Redsun Devils", marines);
        System.out.println(fireTeam);
    }
}