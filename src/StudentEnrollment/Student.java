package StudentEnrollment;

public class Student {
    private int studentId;
    private String name;
    private String email;
    private String enrollmentDate;
    private String course;
    private String phoneNumber;

    public Student(int studentId, String name, String email, String enrollmentDate, String course, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
        this.course = course;
        this.phoneNumber = phoneNumber;
    }


    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getCourse() {
        return course;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", course='" + course + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
