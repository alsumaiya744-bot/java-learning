
package computer;

public class Computer {
    private String CPU;
    private String RAM;
    private String HDD;
    private String graphics;

    private  Computer(ComputerBuilder com) {
        this.CPU = com.CPU;
        this.RAM = com.RAM;
        this.HDD = com.HDD;
        this.graphics = com.graphics;
    }
    void display()
    {
        System.out.println("CUP : "+CPU);
        System.out.println("RAM : "+RAM);
        System.out.println("HDD : "+HDD);
        System.out.println("graphics : "+graphics);
    }
    
    static class ComputerBuilder
    {
        private String CPU;
        private String RAM;
        private String HDD;
        private String graphics;

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
        
        
    }
}
