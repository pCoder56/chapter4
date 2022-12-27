package Students.Retrive;

import Students.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrive retrive = new Retrive();
        List<Student> studentList = new ArrayList<>();
        try {
            studentList = retrive.retriveALl();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Total Students = " + studentList.size());

        for(Student student : studentList)
        {
            System.out.println("Name -> "+ student.getName());
            System.out.println("Age -> "+ student.getAge());
            System.out.println("Batch -> "+ student.getBatch());
            System.out.println("*******************************************");
        }
    }
}
