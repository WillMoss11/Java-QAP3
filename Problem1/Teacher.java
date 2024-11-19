package Problem1;

public class Teacher extends Person {
    private String subject; // Example: "Computer Science", "Chemistry"
    private double salary;  // Annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        // Use the super class’s constructor
        super(name, age, gender);

        // Initialize new properties
        this.subject = subject;
        this.salary = salary;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", teaches: " + subject + ", salary: $" + salary;
    }
}

