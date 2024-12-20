import java.time.LocalDate; //เป็น librery เกี่ยวกับ set เวลา 

public class User {
    protected String name; // ฟิลด์ protected ให้คลาสลูกเข้าถึงได้
    protected LocalDate dob;

    // Constructor
    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // Protected Method
    protected void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}
