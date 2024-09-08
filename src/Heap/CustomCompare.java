package Heap;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rNo;
    double marks;

    Student(String name, int rNo, double marks){
        this.name = name;
        this.rNo = rNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int) this.name.charAt(0) - o.name.charAt(0);
    }
}
public class CustomCompare {

    public static void print(Student[] s) {

        for (int i=0; i<s.length; i++){
            System.out.println("Name : "+s[i].name+", RollNo : "+s[i].rNo+", Marks : "+s[i].marks);
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student("Happy Coder", 15, 78.5);
        s[1] = new Student("Jayant Kumar", 18, 98.5);
        s[2] = new Student("Rohit Sharma", 51, 58.7);
        s[3] = new Student("Virat Kholi", 100, 48.5);
        s[4] = new Student("Lord Thor", 5, 88.3);
        print(s);
        Arrays.sort(s);
        print(s);
    }
}
