import java.util.*;
/*
* A squad consists of one squad leader(that is ranked Sergeant or above) and three fire teams that each contain four marines.
*/
public class Squad {
    private String name;
    private Marine squadLeader;
    private List<FireTeam> fireTeams;
    
    Squad(String name, Marine squadLeader) {
        if (squadLeader.getRank().ordinal() <= 1) { // Checks if there is at least one marine that is corporal or above
            throw new IllegalArgumentException("A squad must consist of a squad leader that is ranked Sergeant or above.");
        }
        this.name = name;
        this.squadLeader = squadLeader;
        this.fireTeams = new ArrayList<FireTeam>();
    }
    
    Squad(Marine squadLeader) {
        this("Squad", squadLeader);
    }
    
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

    public void changeSquadLeager(Marine squadLeader) {
        if (squadLeader.getRank().ordinal() <= 1) { // Checks if there is at least one marine that is corporal or above
            throw new IllegalArgumentException("A squad must consist of a squad leader that is ranked Sergeant or above.");
        }
        this.squadLeader = squadLeader;
    }

    @Override 
    public String toString() {
        return "Squad [name= " + name + ", squadLeader= " + squadLeader + ", fireTeams= " + fireTeams + "]";
    }
}
