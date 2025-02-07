import java.util.*;
/**
 * A platoon consists of one hq(3-5 high ranking marines) and three squads that have thirteen marines each.
 */
public class Platoon {
    private String name;
    private Headquarters headquarters;
    private List<Squad> squads;

    /**
     * 
     * @param name
     * @param headquarters
     */
    Platoon(String name, Headquarters headquarters) {
        this.name = name;
        this.headquarters = headquarters;
        this.squads = new ArrayList<Squad>();
    }

    Platoon(Headquarters headquarters) {
        this("Platoon", headquarters);
    }

    /**
     * 
     * @param name
     * @param squad
     */
    public void addSquad(String name, List<Squad> squad) {
        if (squads.size() >= 3) {
            throw new IllegalStateException("A platoon must consist a maximum of three squads.");
        } else {
            squads.add(new Squad(name, null));
        }
    }

    public List<Squad> getSquads() {
        return squads;
    }

    public String getName() {
        return name;
    }

    public Headquarters getHeadquarters() {
        return headquarters;
    }

    /*
     * The logic to ensure that only high ranking marines are in the HQ will be in the Headquarters class
     */
    public void changeHeadquarters(Headquarters headquarters) {
        this.headquarters = headquarters;
    }

    @Override
    public String toString() {
        return "Platoon [name= " + name + ", headquarters= " + headquarters + ", squads= " + squads + "]";
    }
}
