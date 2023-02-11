
package javaapplication8;

import java.util.ArrayList;
public class Student  extends people{
   private  double gpa;
    public ArrayList<Teacher>teacher;
    
    public Student(String firstName, String lastName, String phoneNum, String email ,double gpa) throws gpaoutofrangeexeption {
        super(firstName, lastName, phoneNum, email);
       if (validGpa(gpa)){
       throw new gpaoutofrangeexeption("gpa out of range");
       }
       else{
           this.gpa=gpa;}
       teacher=new ArrayList<>();
      
    }
    public boolean validGpa(double gpa ) throws gpaoutofrangeexeption{
    
        if(gpa>4.0 || gpa<0.0 ){
            throw new gpaoutofrangeexeption("gpa out of range");
           
        }
        
       return false;
        
    }

  public  void addTeacher(Teacher t) {
    teacher.add(t);
    }

    @Override
    public String toString() {
        return super.toString()+ "Student{" + "gpa=" + (int)gpa + '}';
    }
  
}
