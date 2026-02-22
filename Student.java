
// Test class
public class Student {
    // Private fields
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    
    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        setAge(age);  // Using setter for validation
        this.studentId = studentId;
        this.gpa = 0.0;
    }
    
    // Getters and Setters with validation
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty!");
        }
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Age must be between 5 and 100!");
        }
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between 0.0 and 4.0!");
        }
    }
    
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", 20, "S12345");
        student1.setGpa(3.8);
        student1.displayInfo();
        
        // Test validation
        student1.setAge(150);  // Should show error
        student1.setGpa(5.0);  // Should show error
        student1.setName("");   // Should show error
        
        // Access through getters
        System.out.println("Student name: " + student1.getName());
    }
}
