public class classattributes {
    int number; 
    String text; 

    public classattributes(int num, String txt) {
        this.number = num; 
        this.text = txt; 
    }

    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    public static void main(String[] args) {
        classattributes obj1 = new classattributes(10, "Hello"); 
        classattributes obj2 = new classattributes(20, "World"); 

        obj1.display(); 
        obj2.display(); 
    }
}
