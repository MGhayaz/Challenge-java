package Question78;

public class Bank {
    private int AcNo;
    private String AcHolderName;
    private int balance;

    public Bank(int acNo, String acHolderName, int balance) {
        AcNo = acNo;
        AcHolderName = acHolderName;
        this.balance = balance;
    }

    public void depositBalance(int AcNo, int money) {
        if (this.AcNo == AcNo) {
            if(money > 0){
                this.balance = this.balance + money;
                System.out.printf("cash deposited successfully , current balance is: %d %n", this.balance);
            } else{
                System.out.println("time khrab mat karr");
            }

        }
    }

    public void withdrawBalance(int AcNo, int money) {
        if (this.AcNo == AcNo) {
            if (this.balance < money) {
                System.out.println("insufficient balance !! unable to withdraw");
            } else {
                this.balance = this.balance - money;
                System.out.printf("cash withdraw successfully, current balance is: %d %n", this.balance);
            }
        }
    }
    public String checkBalance() {
        return "current bank balance is "+this.balance;
    }

}

