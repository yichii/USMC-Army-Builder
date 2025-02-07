import java.util.*;
/*
* A squad consists of one squad leader(that is ranked Sergeant or above) and three fire teams that each contain four marines.
*/
public class Squad {
    private String name;
    private Marine squadLeader;
    private List<FireTeam> fireTeams;
    
    /**
    * The default squad constructor ensures that the Squad Leader is ranked at least a Sergeant or above. 
    * only consists of four marines.
    * @param name
    * @param squadLeader
    * @param fireTeams
    */
    Squad(String name, Marine squadLeader, List<FireTeam> fireTeams) {
        if (squadLeader.getRank().ordinal() <= 2) {
            throw new IllegalArgumentException("A squad must consist of a squad leader that is ranked Sergeant or above.");
        } else if (fireTeams.size() != 3) {
            throw new IllegalStateException("A squad must consist a maximum of three fire teams.");
        } else {
            this.name = name;
            this.squadLeader = squadLeader;
            this.fireTeams = fireTeams;
        }
    }
    
    /**
    * Assigns a default name of "Squad" to the squad if none is provided
    * @param squadLeader
    */
    Squad(Marine squadLeader, List<FireTeam> fireTeams) {
        this("Squad", squadLeader, fireTeams);
    }
    
    /**
    * The addFireTeam method prevents adding any more than three fire teams to ensure a maximum number of three fire teams only.
    * @param name
    * @param marines
    */
    public void addFireTeam(String name, List<Marine> marines) {
        if (fireTeams.size() >= 3) {
            throw new IllegalStateException("A squad must consist a maximum of three fire teams.");
        } else {
            fireTeams.add(new FireTeam(name, marines));
        }
    }
    
    public List<FireTeam> getFireTeams() {
        return fireTeams;
    }
    
    public String getName() {
        return name;
    }
    
    public Marine getSquadLeader() {
        return squadLeader;
    }
    
    /**
    * The changeSquadLeader method ensures the chosen marine to replace the Squad Leader with be ranked at least a Sergeant or above
    * @param squadLeader
    */
    public void changeSquadLeader(Marine squadLeader) {
        if (squadLeader.getRank().ordinal() <= 1) { 
            throw new IllegalArgumentException("A squad must consist of a squad leader that is ranked Sergeant or above.");
        } else {
            this.squadLeader = squadLeader;
        }
    }
    
    @Override 
    public String toString() {
        return "Squad [name= " + name + ", squadLeader= " + squadLeader + ", fireTeams= " + fireTeams + "]";
    }
}
