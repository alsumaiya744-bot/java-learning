
package employeemanagementsystem;

import java.util.ArrayList;

public class EmployeeServiceClass {
    ArrayList <Employee> emp=new ArrayList();
    void add(Employee empdetail)
    {
       emp.add(empdetail);
       System.out.println("employee ID added successfully");
    }
    void  display()
    {
        for(Employee e:emp)
        {
            System.out.println("employee ID : "+e.employeeID);
            System.out.println("name : "+e.name);
            System.out.println("department : "+e.department);
            
        }
    }
    void search(int id)
    {
      for(Employee e : emp)
      {
          if(id!=e.employeeID)
          {
              System.out.println("employee not in list");
              break;
          }
          else
          {
            System.out.println("employee ID : "+e.employeeID);
            System.out.println("name : "+e.name);
            System.out.println("department : "+e.department);
            break;
          }
      }
       
    }
}
