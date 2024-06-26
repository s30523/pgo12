import java.util.ArrayList;
public class BankAccount extends Transaction implements AccountOperations {
    private int AccountBalance=0;
    private ArrayList<Transaction> Transactions=new ArrayList<>();

    public BankAccount(int amountToBeTransfered, String inAccount, String outAccount) {
        super(amountToBeTransfered, inAccount, outAccount);
    }
    @Override
    public void checkAccountBalance() {
        System.out.println("Bank account is: "+AccountBalance);
    }

    @Override
    public void makeTransaction() {

    }

    @Override
    public void doPayment() {

    }
}
