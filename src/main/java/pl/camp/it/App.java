package pl.camp.it;

public class App {
    public static void main(String[] args) {
        User user = new User("admin", "Mateusz", "Bereda", "tajnehaslo", Sex.MAN);
        User user2 = new User("admin", "Mateusz", "Bereda", "tajnehaslo", Sex.WOMAN);
        User user3 = new User("admin", "Mateusz", "Bereda", "tajnehaslo", Sex.OTHER);
        User user4 = new User("admin", "Mateusz", "Bereda", "tajnehaslo", Sex.WOMAN);

        System.out.println(Sex.WOMAN.value);

        Sex s = Sex.MAN;
        Sex s2 = Sex.MAN;

        System.out.println(s.value);
        System.out.println(s2.value);

        s.value = "Cos";

        System.out.println(s.value);
        System.out.println(s2.value);

        Console ps5 = Console.PLAYSTATION5;

        System.out.println(ps5);

        Sex[] tab = new Sex[10];

        tab[0] = Sex.MAN;
        tab[1] = Sex.MAN;
        tab[2] = Sex.WOMAN;
        tab[3] = Sex.OTHER;
    }
}
