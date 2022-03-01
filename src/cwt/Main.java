package cwt;

import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> students=new ArrayList<>();
        Scanner studSc=new Scanner(System.in);
        System.out.print("Enter Num of Students: ");
       int numofStudents= studSc.nextInt();
        for(int i=0;i<numofStudents;i++){

            var sc=new Scanner(System.in);

            System.out.print("Enter Name:");
            String name=sc.nextLine();
            System.out.print("Enter Location:");
            String location=sc.nextLine();
            System.out.print("Enter Age:");
            int age=sc.nextInt();

            var student=new Student(name,age,location);
            students.add(student);
        }
        System .out.println("----------------------------------------------------------------------");
        System.out.printf("%20s%15s%15s","STUDENT NAME","AGE","LOCATION");
        System.out.println();
        System .out.println("----------------------------------------------------------------------");

        for (Student std:students){
            System.out.printf("%20s%15s%15s",std.getName(),std.getAge(),std.getLocation());
            System.out.println();
            System .out.println("----------------------------------------------------------------------");

        }
    }
}
