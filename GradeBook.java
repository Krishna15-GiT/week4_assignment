// GradeBook.java (Ques 7)

// Base class for students
class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        if (marks.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum / marks.length;
    }
}

// Subclass for GraduateStudent
class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, int rollNumber, int[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public void printThesisTitle() {
        System.out.println("Thesis: " + thesisTopic);
    }
}

// Main class
public class GradeBook {
    public static void main(String[] args) {
        Student student = new Student("Ram", 101, new int[]{80, 75, 90});
        System.out.println("Student: " + student.getName());
        System.out.println("Average: " + student.calculateAverage());

        GraduateStudent grad = new GraduateStudent("Sita", 102, new int[]{85, 90, 88}, "The way to improve");
        System.out.println("Grad Student: " + grad.getName());
        System.out.println("Average: " + grad.calculateAverage());
        grad.printThesisTitle();
    }
}