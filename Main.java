public class Main {
    public static void main(String[] args) {
        Marine marine1 = new Marine("John", "Marine", Rank.CORPORAL, 24);
        System.out.println(marine1);
        System.out.println(marine1.getAge());
        System.out.println(marine1.getFirstName());
        System.out.println(marine1.getLastName());
        System.out.println(marine1.getRank());
        System.out.println(marine1.getClass());
    }
}