public class constructors {
    int number; 

    public constructors(int number) {
        this.number = number; 
    }

    public void display() {
        System.out.println("The number is: " + this.number);
    }

    public static void main(String[] args) {
        constructors obj1 = new constructors(134); 
        constructors obj2 = new constructors(205); 

        obj1.display(); 
        obj2.display(); 
    }
}