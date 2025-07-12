package Question78;
import Question78.Bank;
public class bank78_Test {
    public static void main(String[] args) {
        Bank AXISbank = new Bank(112, "Ghayaz",1010);
        AXISbank.depositBalance(112,45670);
        AXISbank.withdrawBalance(112,6);
        System.out.println(AXISbank.checkBalance() );

    }
}
