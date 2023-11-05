public class User {
    public static void main(String[] args) {
        User user = new User();

        user.firstName = "John";
        user.lastName = "Smith";
        user.firstName = "Paul";
        user.firstName = null;

        System.out.println("User objektum:");
        System.out.println("firstName: " + user.firstName);
        System.out.println("lastName: " + user.lastName);

        System.out.println("isEmpty(user): " + isEmpty(user));

        int annaFizetes = 2100;
        int cecilFizetes = 1890;
        int emilFizetes = 2050;
        int geraldFizetes = 2920;

        int osszFizetes = annaFizetes + cecilFizetes + emilFizetes + geraldFizetes;

        System.out.println("Fizetések:");
        System.out.println("Anna fizetése: " + annaFizetes);
        System.out.println("Cecil fizetése: " + cecilFizetes);
        System.out.println("Emil fizetése: " + emilFizetes);
        System.out.println("Gerald fizetése: " + geraldFizetes);
        System.out.println("Összkereset: " + osszFizetes);
    }

    private String firstName;
    private String lastName;

    public static boolean isEmpty(User user) {
        return user.firstName == null;
    }
}
