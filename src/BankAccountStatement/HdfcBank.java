package BankAccountStatement;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HdfcBank{

    public static void main(String[] args) {

        List<BankAccount> list = AccountService.getAllAccounts( );
        ExecutorService service = Executors.newFixedThreadPool(5);


        for(BankAccount acc : list){
            List<AccTx> txList = AccountService.getTxHistory("1/01/2025", "31/01/2025", acc.getAccNo());
            service.submit(new Statments(acc,txList));
        }
        service.shutdown();
    }



}
class Statments implements Runnable{

    private final BankAccount acc;
    private final List<AccTx> txList;

    public Statments(BankAccount acc,List<AccTx> txList) {
        this.acc = acc;
        this.txList=txList;
    }

    @Override
    public void run() {
        System.out.println("Generating Statement for " + acc.getAccName() + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Statement generation interrupted");
        }
        prepareStmtPdf(txList,acc);
    }
    public static void prepareStmtPdf(List<AccTx> txList, BankAccount acc){
        System.out.println("Statement PDF generated for AccNo : "+acc.getAccNo()+ " by " + Thread.currentThread().getName());
        System.out.println("Stored statement in AWS S3 Bucket : "+acc.getAccNo()+ " by " + Thread.currentThread().getName());
        System.out.println("Updated the URL in DB : "+acc.getAccNo()+ " by " + Thread.currentThread().getName());
        System.out.println("Sent the Email to : "+acc.getEmail() +" Successfully by " + Thread.currentThread().getName());
    }
}