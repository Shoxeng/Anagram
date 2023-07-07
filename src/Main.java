
public class Main {

    public static void main(String[] args) {
        AnagramChecker check = new AnagramChecker();
        System.out.println(check.isAnagram("123","321"));
        System.out.println(check.isAnagram("1234","321"));
        System.out.println(check.isAnagram("Ben","NEb"));
        System.out.println(check.isAnagram("JOSH","josh"));
        System.out.println(check.isAnagram("ZA !/@%^&ZA","zaza"));
        System.out.println(check.isAnagram("AZ09","90ZA"));
    }

}