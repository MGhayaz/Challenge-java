public class Question75 {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "ghayaz,", "galvatron,", "titan,", "chand,", "aur Irshad", "sab ka", "malik", "ek hai"
        };
        StringBuilder hero = new StringBuilder();
        for (String str : arr) {
            hero.append(str).append(" ");
        }

        System.out.print(hero);

    }
}
