public class classmethods {
    int number; 

    public classmethods(int num) {
        this.number = num; 
    }

    public void display() {
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        classmethods obj1 = new classmethods(10); 
        classmethods obj2 = new classmethods(20); 

        obj1.display(); 
        obj2.display(); 
    }
}
