import java.util.*;
/*
* A fireteam consists of four marines with one being ranked Corporal or above.
*/
public class FireTeam {
    private String name;
    private List<Marine> marines;    
    
    FireTeam(String name, List<Marine> marines) {
        boolean containsOfficer = false;
        for (Marine marine: marines) {
            if (marine.getRank().ordinal() >= 1) { // Checks if there is at least one marine that is corporal or above
                containsOfficer = true;
                break;
            }
            containsOfficer = false;
        }
        
        if (marines.size() != 4) {
            throw new IllegalArgumentException("A fire team must consist of four marines.");
        } else if (containsOfficer == false) {
            throw new IllegalArgumentException("A fire team must consist of at least one ranked Corporal or above.");
        } else {
            this.name = name;
            this.marines = marines;
        }                  
    }
    
    FireTeam(List<Marine> marines) {
        this("Fire Team", marines);
    }
    
    public String getName() {
        return name;
    }
    
    public List<Marine> getMarines() {
        return marines;
    }

    @Override 
    public String toString() {
        return "Fire Team [name= " + name + ", marines= \n" + marines + "]";
    }
}
