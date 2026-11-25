public class scope {
    static int x = 10; 

    public static void main(String[] args) {
        int x = 5; 
        System.out.println("Value of x in main method: " + x);
        System.out.println("Value of class-level x: " + scope.x);
        display();
    }

    static void display() {
        System.out.println("Value of x in display method: " + x);
    }
}
