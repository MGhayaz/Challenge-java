public class Question73 {
    //dice
    int dice;

    Question73(){
        this.dice = (int)(Math.random() * 6 ) + 1 ;
    }
    public String toString(){
        return dice + " is the random number of dice ";
    }
    public static void main(String[] args) {
        System.out.println("Welcome to dice game");
        Question73 p6Dice = new Question73();
        System.out.println(p6Dice);
    }
}
