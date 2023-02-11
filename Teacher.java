
package javaapplication8;
import java.util.ArrayList;
public class Teacher extends people{
    private double salary;
 public ArrayList<Student>student;
 
    public Teacher(String firstName, String lastName, String phoneNum, String email,double salary) {
        super(firstName, lastName, phoneNum, email);
        this.salary=salary;
         student=new ArrayList<>();
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

 public   void addStudent(Student s) {
     student.add(s);
    }

    @Override
    public String toString() {
        return super.toString()+" Teacher{" + "salary=" + (int)salary + '}';
    }

   
    
}
