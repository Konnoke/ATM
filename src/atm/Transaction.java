package atm;

/**
 *
 * @author Zarathustra aka Kevin Baik
 */
abstract public class Transaction {

    protected int transactionNumber;

    public Transaction(int tNumber) {
        transactionNumber = tNumber;
    }

    abstract public void makeTransaction();
}
