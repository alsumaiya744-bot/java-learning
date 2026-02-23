
package studentmanagementsystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentDetails {
    Set<Integer> studentID=new HashSet<>();
    Map<Integer,Students> studentDeatils=new HashMap();
     Students student; 
     
    void addStusent(int ID,String name)
    {
        if(studentID.contains(ID))
        {
            System.out.println("student id was already added");
        }
        else
        {
            student=new Students(name, ID);
            studentID.add(ID);
            
            studentDeatils.put(ID, student);
            System.out.println("student details added successfully");
        }
    }
    void remove(int ID)
    {
        if(studentID.isEmpty())
        {
            System.out.println("student details is not added yet");
        }
        else if(studentID.contains(ID))
        {
            studentID.remove(ID);
            studentDeatils.remove(ID);
            System.out.println("ID- "+ID+" removed successfully");
        }
        else
        {
            System.out.println("ID- "+ID+" already removed");
        }
    }
    void search(int ID)
    {
        if(studentID.isEmpty())
        {
            System.out.println("student details is not added yet");
        }
        else if(studentDeatils.containsKey(ID))
        {
               Students student=studentDeatils.get(ID);
              
              System.out.println("Student ID : "+student.getID());
              System.out.println("Student Name : "+student.getStudentName());
        }
        
        else
        {
            System.out.println("student ID cannot found");
        }        
    }
    void display()
    {
       for(Map.Entry<Integer,Students> m : studentDeatils.entrySet())
       {
           System.out.println("--------------------------------------");
           System.out.println("Student ID : "+m.getKey());
           System.out.println("Student Name : "+m.getValue().getStudentName());
           System.out.println("--------------------------------------");
       }
    }
    void studentCount()
    {
        System.out.println("Total Student Count : "+student.studentCount);
    }
}
