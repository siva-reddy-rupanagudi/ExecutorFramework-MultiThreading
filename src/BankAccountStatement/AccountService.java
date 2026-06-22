package BankAccountStatement;

import java.util.Arrays;
import java.util.List;

public class AccountService {
    public static  List<BankAccount> getAllAccounts(){
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("ACC1001", "Siva Kumar", "siva.kumar@example.com"),
                new BankAccount("ACC1002", "Anita Sharma", "anita.sharma@example.com"),
                new BankAccount("ACC1003", "Rahul Verma", "rahul.verma@example.com"),
                new BankAccount("ACC1004", "Priya Nair", "priya.nair@example.com"),
                new BankAccount("ACC1005", "Arjun Mehta", "arjun.mehta@example.com"),
                new BankAccount("ACC1006", "Neha Singh", "neha.singh@example.com"),
                new BankAccount("ACC1007", "Ravi Patel", "ravi.patel@example.com"),
                new BankAccount("ACC1008", "Meera Joshi", "meera.joshi@example.com"),
                new BankAccount("ACC1009", "Karan Malhotra", "karan.malhotra@example.com"),
                new BankAccount("ACC1010", "Sneha Reddy", "sneha.reddy@example.com"),
                new BankAccount("ACC1011", "Vikram Desai", "vikram.desai@example.com"),
                new BankAccount("ACC1012", "Pooja Iyer", "pooja.iyer@example.com"),
                new BankAccount("ACC1013", "Amit Chauhan", "amit.chauhan@example.com"),
                new BankAccount("ACC1014", "Shreya Kapoor", "shreya.kapoor@example.com"),
                new BankAccount("ACC1015", "Manoj Gupta", "manoj.gupta@example.com"),
                new BankAccount("ACC1016", "Ritika Bansal", "ritika.bansal@example.com"),
                new BankAccount("ACC1017", "Deepak Yadav", "deepak.yadav@example.com"),
                new BankAccount("ACC1018", "Kavya Menon", "kavya.menon@example.com"),
                new BankAccount("ACC1019", "Sanjay Rao", "sanjay.rao@example.com"),
                new BankAccount("ACC1020", "Divya Kulkarni", "divya.kulkarni@example.com")
        );
        return accounts;
    }
    public static List<AccTx> getTxHistory(String stDate,String endDate,String accNo){
      return AccTx.getTxHistory(stDate,endDate,accNo);
    }
}
