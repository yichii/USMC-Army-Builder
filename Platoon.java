import java.util.*;
/**
* A platoon consists of one hq(3-5 high ranking marines) and three squads that have thirteen marines each. It also consists of a headquarters 
* of 3-5 high ranking marines. 
*/
public class Platoon extends Unit{
    private Headquarters headquarters;
    private List<Squad> squads;
    
    /**
    * 
    * @param name
    * @param headquarters
    */
    Platoon(String name, Headquarters headquarters) {
        super(name);
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
    public void addSquad(Squad squad) {
        if (squads.size() >= 3) {
            throw new IllegalStateException("A platoon must consist a maximum of three squads.");
        } else {
            squads.add(squad);
        }
    }
    
    public List<Squad> getSquads() {
        return squads;
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
        return "Platoon [name= " + super.getName() + ", headquarters= " + headquarters + ", squads= " + squads + "]";
    }
}
