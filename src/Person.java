import java.util.Calendar;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String toCSV() {
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.YOB;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public String formalName() {
        return this.title + " " + this.lastName;
    }

    public String getAge() {
        return String.valueOf(2022-this.YOB);
    }

    public String getAge(int year) {
        int date = Calendar.getInstance().get(Calendar.YEAR);
        return String.valueOf(date - year);
    }
}
