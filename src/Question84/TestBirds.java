package Question84;

public class TestBirds {
    public static void main(String[] args) {
        Eagle eag = new Eagle();
        eag.fly(); // from interface- implemented to bird
        System.out.println(eag.getBreed()); // from bird-parent of eagle
    }
}
