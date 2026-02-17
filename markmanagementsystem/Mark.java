package markmanagementsystem;

public class Mark {
  private int[] marks;
  private int count; 

    public Mark(int size) {
        marks=new int[size];
    }
    void addMark(int mark)throws IllegalArgumentException,ArrayIndexOutOfBoundsException
    {
        if(mark<0 || mark>100)
        {
            throw new IllegalArgumentException("mark must be greater than 0 and less than 100");
        }
        if(count>marks.length)
        {
            throw new ArrayIndexOutOfBoundsException("Mark storage is full"); 
        }
        marks[count]=mark;
        count++;
        System.out.println("mark successfully stored");
    }
    void display()
    {
        if(count==0)
        {
            System.out.println("no mark is entered");
        }
        System.out.println("stored marks : ");
        for(int a : marks)
        {
            System.out.println(a);
        }
    }
}
