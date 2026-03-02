
package studentdetailsBuilder;

public class Student {
    private int ID;
    private String name;
    private String email;
    private long phone;
    private String address;

    public Student(StudentBuilder sb) {
        this.ID = sb.ID;
        this.name = sb.name;
        this.email = sb.email;
        this.phone = sb.phone;
        this.address = sb.address;
    }
    
    void display()
    {
        System.out.println("ID : "+ID);
        System.out.println("name : "+name);
        System.out.println("email : "+email);
        System.out.println("phone : "+phone);
        System.out.println("address : "+address);
    }
    
    static class StudentBuilder
    {
        private int ID;
        private String name;
        private String email;
        private long phone;
        private String address;

        public StudentBuilder(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }
        

        
        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        
        Student stu()
        {
            return new Student(this);
        }
    }
        
}
