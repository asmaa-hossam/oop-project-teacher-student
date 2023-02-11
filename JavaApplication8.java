package javaapplication8;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication8 {

    static boolean x = true;
    static ArrayList<Student> student = new ArrayList<Student>();
    static ArrayList<Teacher> teacher = new ArrayList<Teacher>();

    public static void main(String[] args) throws gpaoutofrangeexeption {
//add three student into array list 
        student.add(new Student("ahmed", "ali", "010225557", "ahmedali@gmail.com", 1));
        student.add(new Student("amr", "abdo", "0108857955", "amrabdo@gmail.com", 2));
        student.add(new Student("mai", "omar", "0115875848", "maiiomar@gmail.com", 3));
        //add tow teacher into array list 
        teacher.add(new Teacher("mohamed", "sayed", "01025879", "mohamedsayed@gmail.com", 1000.0));
        teacher.add(new Teacher("ahmed", "saif", "01025875", "ahmedsaif@gmail.com", 2000.0));

        Scanner input = new Scanner(System.in);
        while (x) {
            displaymenu();
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("add Teacher Information");
                    teacher.add(new Teacher("firstnama is  "+input.next(),"second name is " +input.next(), "phone number is "
                            +input.next(),"email is "+ input.next()+ "salary is  ", input.nextInt()));
                   
                    break;

                case 2:
                    System.out.println("add student Information");
                    student.add(new Student("firstnama is  "+input.next(),"second name is " + input.next(),
                            "phone number is "+input.next(), "email is "+ input.next()+"dpa is ", input.nextInt()));
                    break;

                case 3:
                    System.out.println("please inter student id ");
                    System.out.println("please inter teacher id ");

                    bindTeacherWithStudent( input.nextInt(), input.nextInt());
                    break;

                case 4:
                    System.out.println("print all teacher information ");
                    for (int i = 0; i < teacher.size(); i++) {
                        System.out.println(teacher.get(i).toString());
                    }
                    break;

                case 5:
                    System.out.println("print all student information ");
                    for (int i = 0; i < student.size(); i++) {
                        System.out.println(student.get(i).toString());
                    }
                    break;

                case 6:
                    System.out.println("display student information for a certain teacher");
                    System.out.println("please inter teacher id ");
                    displayTeachersStudnet(input.nextInt());
                    break;
                case 7:
                    System.out.println("display teacher information for a certain student ");
                    System.out.println("please inter student id ");
                    displaystudentsteacher(input.nextInt());
                    break;
                case 8:
                    System.err.println("Exiting from program");
                    x = false;
                    break;
            }
            if (x == false) {
                break;
            }
        }

    }

    static void bindTeacherWithStudent(int studentId, int teacherId) {
        Student s = null;
        Teacher t = null;
        for (Student i : student) {
            if (i.getId() == studentId) {
                s = i;
                break;
            }
        }
//        t.student.forEach(System.out::println);
        for (Teacher i : teacher) {
            if (i.getId() == teacherId) {
                t = i;
                break;
            }
        }
        if (t != null) {
            t.addStudent(s);
        }
        if (s != null) {
            s.addTeacher(t);
        }
    }

    static void displayTeachersStudnet(int teacherId) {
        Teacher t = null;

        for (Teacher i : teacher) {
            if (i.getId() == teacherId) {
                t = i;
                break;
            }
        }
        if (t != null) {
            t.student.forEach(System.out::println);
        }
    }

    private static void displaymenu() {
        System.out.println("press number from menue \n 1 2 3 4 5 6 7 8");

    }

    static void displaystudentsteacher(int studentId) {
        Student s = null;

        for (Student i : student) {
            if (i.getId() == studentId) {
                s = i;
                break;
            }
        }
        if (s != null) {
            s.teacher.forEach(System.out::println);
        }
    }

}
