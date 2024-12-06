package OPPs.Introduction;

import java.util.Arrays;

public class Main {

    // class --> logical construct (store stack memory)
    // object --> physical construct (store heap memory)

    public static void main(String[] args) {

        int[] number = new int[5]; // store student number
        String[] name = new String[5]; //  store student name
        float[] marks = new float[5]; // store student marks


        // store student data
        int[] number1 = new int[5];
        String[] name1 = new String[5];
        float[] marks1 = new float[5];


        // store student data in object
        Student s1  = new Student();
        s1.number = 1;
        s1.name = "Happy Coder";
        s1.marks = 78.5f;
        System.out.println(s1);

        Student s2  = new Student();
        s2.number = 2;
        s2.name = "Jayant Kumar";
        s2.marks = 80.5f;
        System.out.println(s2);

        Student s3  = new Student();
        s3.number = 3;
        s3.name = "Rohit Sagar";
        s3.marks = 78.5f;
        System.out.println(s3);

        Student s4  = new Student();
        s4.number = 4;
        s4.name = "Jayant Sagar";
        s4.marks = 55.0f;
        System.out.println(s4);

        Student s5  = new Student();
        s5.number = 5;
        s5.name = "Shobit ";
        s5.marks = 78.4f;
        System.out.println(s5);

        Student[] st = new Student[5];



    }

}

class Student{
    int number;
    String name;
    float marks;

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
