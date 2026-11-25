public class classesobjects {
    int number; 

    public classesobjects(int num) {
        this.number = num; 
    }

    public void display() {
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        classesobjects obj1 = new classesobjects(10); 
        classesobjects obj2 = new classesobjects(20); 

        obj1.display(); 
        obj2.display(); 
    }
}
