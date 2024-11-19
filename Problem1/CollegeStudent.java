package Problem1;

public class CollegeStudent extends Student {
    private String major; // Example: "Electrical Engineering", "Communications"
    private int year;     // Example: 1 = FROSH, 2 = SOPH, etc.

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        // Use the super class’ constructor
        super(name, age, gender, idNum, gpa);

        // Initialize new properties
        this.year = year;
        this.major = major;
    }

    // Getters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}

