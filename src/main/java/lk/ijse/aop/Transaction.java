package lk.ijse.aop;


import org.springframework.stereotype.Component;

@Component("transaction")
public class Transaction {

    public void startTransaction() {
        System.out.println("Transaction Started");
    }
    public void endTransaction() {
        System.out.println("Transaction Ended");

    }
}
