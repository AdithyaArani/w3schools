public class thiskeyword {
    int number; 

    public thiskeyword(int number) {
        this.number = number; 
    }

    public void display() {
        System.out.println("The number is: " + this.number);
    }

    public static void main(String[] args) {
        thiskeyword obj1 = new thiskeyword(134); 
        thiskeyword obj2 = new thiskeyword(205); 

        obj1.display(); 
        obj2.display(); 
    }
}
