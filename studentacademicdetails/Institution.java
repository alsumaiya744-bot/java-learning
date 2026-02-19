
package studentacademicdetails;
import java.util.Scanner;
public class Institution {
    static final String institutionName="ABC college";
    Scanner obj=new Scanner(System.in);
    class Student
    {
        String studentName;
        int rollNo;
        int mark[];
        int totalMark;
        double average;
        int size;
        String grade;

        public Student(String studentName, int rollNo,int size) {
            this.studentName = studentName;
            this.rollNo = rollNo;
            this.size=size;
            mark=new int[size];
        }
        void enterMarks()
        {
            for(int i=0;i<mark.length;i++)
            {
                System.out.println("enter the mark "+(i+1)+" :");
                mark[i]=obj.nextInt();
                totalMark+=mark[i];
            }
        }
        void grade()
        {
            average=totalMark/(double)size;
            if((average>=90)&&(average<=100))
            {
                grade="A";
            }
            else if((average>=75)&&(average<=89))
            {
                grade="B";
            }
            else if((average>=50)&&(average<=74))
            {
                grade="C";
            }
            else if(average<50)
            {
                grade="Fail";
            }
            else
            {
                System.out.println("enter correct marks");
            }
        }
        void displayStudentDetails()
        {
            System.out.println("Institute Name : "+institutionName);
            
            System.out.println("Student name : "+studentName);
            System.out.println("Roll No : "+rollNo);
            System.out.print("Marks : ");
            for(int a : mark)
            {
                System.out.print(a+" ,");
            }
            System.out.println();
            System.out.println("Average : "+average);
            System.out.println("Grade : "+grade);
        }
        
    }
}
