package Students.Retrive;

import Students.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// for sql injection

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retrive retrive = new Retrive();

        List<Student> studentList = new ArrayList<>();


        System.out.println("Enter User Id: ");
        String userId = scanner.nextLine();

        try{
            studentList = retrive.sqlInjection(userId);

            for(Student student : studentList) {
                System.out.println("Name -> "+ student.getName());
                System.out.println("Age -> "+ student.getAge());
                System.out.println("Batch -> "+ student.getBatch());
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}

// 10 or 1 = 1 in output run