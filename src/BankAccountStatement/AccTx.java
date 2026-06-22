package BankAccountStatement;

import java.util.*;

public class AccTx {
    private String txId;
    private String accNo;
    private Date txDate;
    private String txType;
    private double amount;
    private String description;
    private String status;

    public AccTx(String txId, String accNo, Date txDate, String txType,
                 double amount, String description, String status) {
        this.txId = txId;
        this.accNo = accNo;
        this.txDate = txDate;
        this.txType = txType;
        this.amount = amount;
        this.description = description;
        this.status = status;
    }

    // Getters & Setters
    public String getTxId() { return txId; }
    public void setTxId(String txId) { this.txId = txId; }

    public String getAccNo() { return accNo; }
    public void setAccNo(String accNo) { this.accNo = accNo; }

    public Date getTxDate() { return txDate; }
    public void setTxDate(Date txDate) { this.txDate = txDate; }

    public String getTxType() { return txType; }
    public void setTxType(String txType) { this.txType = txType; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "executionFramwork.AccTx{" +
                "txId='" + txId + '\'' +
                ", accNo='" + accNo + '\'' +
                ", txDate=" + txDate +
                ", txType='" + txType + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public static List<AccTx> getTxHistory(String stDate, String endDate, String accNo) {
        List<AccTx> txList = new ArrayList<>();

        txList.add(new AccTx("TXN001", accNo, new Date(), "Credit", 5000.00,
                "Salary Credit", "Success"));
        txList.add(new AccTx("TXN002", accNo, new Date(), "Debit", 1200.00,
                "Electricity Bill", "Success"));
        txList.add(new AccTx("TXN003", accNo, new Date(), "Debit", 800.00,
                "Mobile Recharge", "Success"));
        txList.add(new AccTx("TXN004", accNo, new Date(), "Credit", 2000.00,
                "Refund from Vendor", "Pending"));

        return txList;
    }
}
