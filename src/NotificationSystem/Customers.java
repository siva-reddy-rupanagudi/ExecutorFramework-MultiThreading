package NotificationSystem;

import java.util.List;

public class Customers {
    private String custId;
    private String custName;
    private String custEmail;
    private Long custPhone;

    public Customers(String custId, String custName, String custEmail, Long custPhone) {
        this.custId = custId;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPhone = custPhone;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Long getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(Long custPhone) {
        this.custPhone = custPhone;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", custPhone=" + custPhone +
                '}';
    }
    public static List<Customers> getAllCustomers(){
        return List.of(
                new Customers("CUST1001", "Siva Kumar", "siva.kumar@example.com", 9876543210L),
                new Customers("CUST1002", "Anita Sharma", "anita.sharma@example.com", 9123456780L),
                new Customers("CUST1003", "Rahul Verma", "rahul.verma@example.com", 9988776655L),
                new Customers("CUST1004", "Priya Singh", "priya.singh@example.com", 9001122334L),
                new Customers("CUST1005", "David Lee", "david.lee@example.com", 9112233445L),
                new Customers("CUST1006", "Maria Gonzalez", "maria.gonzalez@example.com", 9223344556L),
                new Customers("CUST1007", "James Anderson", "james.anderson@example.com", 9334455667L),
                new Customers("CUST1008", "Li Wei", "li.wei@example.com", 9445566778L),
                new Customers("CUST1009", "Fatima Khan", "fatima.khan@example.com", 9556677889L),
                new Customers("CUST1010", "Olivia Brown", "olivia.brown@example.com", 9667788990L),
                new Customers("CUST1011", "Noah Wilson", "noah.wilson@example.com", 9778899001L),
                new Customers("CUST1012", "Emma Davis", "emma.davis@example.com", 9889900112L),
                new Customers("CUST1013", "Liam Miller", "liam.miller@example.com", 9990011223L),
                new Customers("CUST1014", "Ava Martinez", "ava.martinez@example.com", 9001122335L),
                new Customers("CUST1015", "Sophia Hernandez", "sophia.hernandez@example.com", 9112233446L)
        );
    }
}
