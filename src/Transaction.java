public class Transaction {
    private int amountToBeTransfered;
    private String InAccount;
    private String OutAccount;

    public Transaction(int amountToBeTransfered, String inAccount, String outAccount) {
        this.amountToBeTransfered = amountToBeTransfered;
        InAccount = inAccount;
        OutAccount = outAccount;
    }
    public void showInfo(){
        System.out.println("amount to be transfered: " + amountToBeTransfered + ", name of in account" + getInAccount() + ", name of out account" + getOutAccount() );
    }

    public int getAmountToBeTransfered() {
        return amountToBeTransfered;
    }

    public String getInAccount() {
        return InAccount;
    }

    public String getOutAccount() {
        return OutAccount;
    }
    public void setAmountToBeTransfered(int amountToBeTransfered) {
        this.amountToBeTransfered = amountToBeTransfered;
    }

    public void setInAccount(String inAccount) {
        InAccount = inAccount;
    }

    public void setOutAccount(String outAccount) {
        OutAccount = outAccount;
    }
}
