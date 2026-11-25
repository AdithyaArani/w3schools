public class classchallenge {
    int number; 

    public classchallenge(int num) {
        this.number = num; 
    }

    public void display() {
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        classchallenge obj1 = new classchallenge(30); 
        classchallenge obj2 = new classchallenge(40); 

        obj1.display(); 
        obj2.display(); 
    }
}
