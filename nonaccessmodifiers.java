public class nonaccessmodifiers {
    int number; 

    public nonaccessmodifiers(int number) {
        this.number = number; 
    }

    public void display() {
        System.out.println("The number is: " + this.number);
    }

    public static void main(String[] args) {
        nonaccessmodifiers obj1 = new nonaccessmodifiers(14); 
        nonaccessmodifiers obj2 = new nonaccessmodifiers(25); 

        obj1.display(); 
        obj2.display(); 
    }
}