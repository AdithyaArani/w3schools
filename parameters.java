public class parameters {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        myMethod("Liam",5);
        myMethod("Jenny",8);
        myMethod("Anja",32);
    }
}
