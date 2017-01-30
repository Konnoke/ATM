package atm;

/**
 *
 * @author Zarathustra aka Kevin Baik
 */
abstract public class Transaction extends Thread{

    protected int transactionNumber;

    public Transaction(int tNumber) {
        transactionNumber = tNumber;
    }

    abstract public void makeTransaction();
}
