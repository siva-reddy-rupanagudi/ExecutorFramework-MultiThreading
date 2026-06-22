package BankAccountStatement;

public class BankAccount {
    private String accNo;
    private String accName;
    private String email;

    public BankAccount(String accNo, String accName, String email) {
        this.accNo = accNo;
        this.accName = accName;
        this.email = email;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "executionFramwork.BankAccount{" +
                "accNo='" + accNo + '\'' +
                ", accName='" + accName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
