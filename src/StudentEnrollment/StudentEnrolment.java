package StudentEnrollment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudentEnrolment {
    public static void main(String[] args) {
        Student st=new Student(1001, "Alice Smith", "alice.smith@example.com", "2023-08-15", "Computer Science","7766887790");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->saveEnrolment(st));
        executorService.submit(()->sendEmail(st));
        executorService.submit(()->generateInvoice(st));
        executorService.submit(()->sendWhatsAppmsg(st));
        executorService.submit(()->updateCRM(st));
        executorService.shutdown();

    }

    private static void sendEmail(Student st) {
        System.out.println("Sending enrolment confirmation email to " + st.getEmail() + " for " + st.getName() + " by " + Thread.currentThread().getName());
    }

    private static void saveEnrolment(Student st) {
        System.out.println("Saving enrolment details for " + st.getName() + " by " + Thread.currentThread().getName());
    }

    private static void generateInvoice(Student st) {
        System.out.println("Generating invoice for " + st.getName() + " by " + Thread.currentThread().getName());
    }

    private static void sendWhatsAppmsg(Student st) {
        System.out.println("Sending WhatsApp message to " + st.getPhoneNumber() + " for " + st.getName() + " by " + Thread.currentThread().getName());
    }

    private static void updateCRM(Student st) {
        System.out.println("Updating CRM for " + st.getName() + " by " + Thread.currentThread().getName());
    }
}
