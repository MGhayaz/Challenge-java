public class Student70Question {
    int studentMarks;
    String studentName;

    public Student70Question(int marks, String name) {
        this.studentMarks = marks;
        this.studentName = name;
    }

    public String toString() {
        return "Student details{ name: "+studentName+", marks: "+studentMarks+" }";
    }


    public static void main(String[] args) {
        Student70Question ghayaz = new Student70Question(90,"Ghayaz");
        System.out.println(ghayaz); // auto toString called
    }
}
