package atm;

/**
 *
 * @author Zarathustra aka Kevin Baik
 */
public abstract class Transaction {
    protected int transNum;
    protected int transactionNumber;

    public Transaction(int tNumber) {
        transactionNumber = tNumber;
    }

    public abstract void makeTransaction();
}
