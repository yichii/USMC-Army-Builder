import java.util.*;
/*
* Unit Composition: fireteam -> squad -> platoon -> company -> battalion -> regiment -> division
*/
public class Main {
    public static void main(String[] args) {
        ArmyGenerator ag = new ArmyGenerator();
        FireTeam ft1 = ag.createFireTeam("Firelight", null);
        System.out.println(ft1);

        List<Marine> marines = new ArrayList<Marine>(List.of(
            new Marine("John", "Snow", 22),
            new Marine("John", "Snow", Rank.SERGEANT, 22),
            new Marine("John", "Snow", 22),
            new Marine("John", "Snow", 22)
        ));

        FireTeam ft2 = new FireTeam(marines);
        System.out.println(ft2);
    }
}
