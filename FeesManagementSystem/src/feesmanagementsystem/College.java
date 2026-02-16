
package feesmanagementsystem;

public class College {
    static final String COLLEGE_NAME="ABC college";
    final double REGISTRATION_FEE;
    static int studentCount;

    public College(double fees) {
        REGISTRATION_FEE=fees;
        studentCount++;
    }
    static void displayCollegeDetails()
    {
        System.out.println("College Name : "+COLLEGE_NAME);
        System.out.println("Total Student in College : "+studentCount+" Students");
    }
    void registrationFees()
    {
        System.out.println("fees of student "+studentCount+" : "+REGISTRATION_FEE);
    }
    
    
}
