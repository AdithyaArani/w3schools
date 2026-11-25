public class encapsulation {
    private int number; 

    public encapsulation(int number) {
        this.number = number; 
    }

    public void setNumber(int number) {
        this.number = number; 
    }

    public int getNumber() {
        return this.number; 
    }

    public void display() {
        System.out.println("The number is: " + this.number);
    }

    public static void main(String[] args) {
        encapsulation obj1 = new encapsulation(134); 
        encapsulation obj2 = new encapsulation(205); 

        obj1.display(); 
        obj2.display(); 

        obj1.setNumber(300); 
        System.out.println("Updated number in obj1: " + obj1.getNumber());
    }
}
