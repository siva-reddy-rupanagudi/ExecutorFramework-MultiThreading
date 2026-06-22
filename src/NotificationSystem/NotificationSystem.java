package NotificationSystem;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Service implements Runnable{
    private Customers cus;
    private String msg;
    Service(Customers cus,String msg){
        this.msg=msg;
        this.cus=cus;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            System.out.println("Notification System failed to sent the msg.....!");;
        }
        System.out.println(msg+"\nNotification Sent Through the WhatsApp "+cus.getCustPhone()+" Successfully by "+Thread.currentThread().getName());
        System.out.println(msg+"\nNotification Sent Through the Email "+cus.getCustEmail()+" Successfully by "+Thread.currentThread().getName());

    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        List<Customers> customers = Customers.getAllCustomers();
        String msg = ", Big Billion Day Sale is live now! Get up to 80% discount on mobiles, laptops, fashion, and electronics. Hurry up!";
        ExecutorService service = Executors.newFixedThreadPool(5);
        for(Customers cus:customers){
            service.submit(new Service(cus,"Dear "+cus.getCustName()+msg));
        }
        service.shutdown();

    }
}