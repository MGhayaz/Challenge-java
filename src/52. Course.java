class course {
    static int MaxCapacity;
    String courseName;
    int enrollments;
    String[] enRolledStudents;

    course(String courseName) {
        this.courseName = courseName;
        enRolledStudents = new String[MaxCapacity];
    }

    static void setMaxCapacity(int MaxCapacity) {
        course.MaxCapacity = MaxCapacity;
    }
    void enrolledStudent(String studentName){
        enRolledStudents [enrollments] = studentName;
        enrollments++;
    }
    void unEnrolledStudent(String studentName){
        System.out.println("data removed");
        enrollments--;
    }
}
