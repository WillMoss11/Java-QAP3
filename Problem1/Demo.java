package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create a Person instance
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        // Create a Student instance
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // Create a Teacher instance
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // Create a CollegeStudent instance
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}

