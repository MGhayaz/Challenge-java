package Question94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        // below here, the custom obj is taken in generics diamond operator
        PriorityQueue <Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student gradecompare1, Student gradeCompare2) {
                return gradecompare1.getGrade() - gradeCompare2.getGrade();
            }
        });

        queue.offer(new Student("Sam",'F'));
        queue.offer(new Student("Jacob",'A'));
        queue.offer(new Student("alice",'B'));
        queue.offer(new Student("alex",'C'));
        queue.offer(new Student("Shruk",'D'));

        //System.out.println(queue); // ye kaam nai karta kyuki prorityQueue head se removal pe sort karta

        System.out.printf("here is %s",queue.poll());
        System.out.printf("here is %s",queue.poll());
        System.out.printf("here is %s",queue.poll());
        System.out.printf("here is %s",queue.poll());
        System.out.printf("here is %s",queue.poll());
        // current level with action made like poll/add, ye wala queue, action ke baad newly added or
        // removed element wise sort karta, naki pre-sort karke rakta like list



    }






    public static class Student{
        private final String name;
        private final char grade;

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : "+ grade + " ";
        }

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }


    }



}
