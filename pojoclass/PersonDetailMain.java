package pojoclass;

import java.util.Scanner;


public class PersonDetailMain {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Person p =new Person();
        System.out.println("enter name :");
        String name=obj.nextLine();
        p.setName(name);
        System.out.println("enter age :");
        int age=obj.nextInt();
        p.setAge(age);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
    
}
