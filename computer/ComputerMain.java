
package computer;

import java.util.Scanner;

public class ComputerMain {

    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("enter  CPU : ");
        String CPU=obj.nextLine();
        System.out.println("enter RAM : ");
        String RAM=obj.nextLine();
        System.out.println("enter HDD : ");
        String HDD=obj.nextLine();
        System.out.println("enter graphics : ");
        String graphics=obj.nextLine();
        
        Computer com=new Computer.ComputerBuilder(CPU,RAM).setHDD(HDD).setGraphics(graphics).build();
        com.display();
        
    }
    
}
