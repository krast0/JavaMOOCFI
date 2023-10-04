
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account Matthewacc = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account",0);

        Matthewacc.withdrawal(100);
        myAcc.deposit(100);

        System.out.println(Matthewacc);
        System.out.println(myAcc);
        // write your program here
    }
}
