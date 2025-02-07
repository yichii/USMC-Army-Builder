enum Rank {
    PRIVATE, CORPORAL, SERGEANT, LIEUTENANT, CAPTAIN, MAJOR, COLONEL, GENERAL, COMMANDER // Add more(you dont have to put all)
}

public class Marine {
    private String firstName;
    private String lastName;
    private Rank rank;
    private int age; 
    
    /**
    * 
    * @param firstName
    * @param lastName
    * @param rank
    * @param age
    */
    public Marine(String firstName, String lastName, Rank rank, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.age = age;
    }
    
    /**
    * Assigns a default last name of "N/A" to the marine if none is provided
    * @param firstName
    * @param rank
    * @param age
    */
    public Marine(String firstName, Rank rank, int age) {
        this(firstName, "N/A", rank, age);
    }
    
    /**
    * Assigns a default rank of Private to the marine if none is provided
    * @param firstName
    * @param lastName
    * @param age
    */
    public Marine(String firstName, String lastName, int age) {
        this(firstName, lastName, Rank.PRIVATE, age);
    }
    
    public String getFirstName() { 
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public Rank getRank() {
        return rank;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override 
    public String toString() {
        return "Marine [firstName= " + firstName + ", lastName= " + lastName + ", rank= " + rank + ", age= " + age + "]\n";
    }
}
