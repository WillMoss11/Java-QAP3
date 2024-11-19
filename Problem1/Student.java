package Problem1;

public class Student extends Person {
    protected String myIdNum; // Student ID Number
    protected double myGPA;   // Grade Point Average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        // Use the super class’ constructor
        super(name, age, gender);

        // Initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setters
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
