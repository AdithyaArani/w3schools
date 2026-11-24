public class returnvalues {
    static int myMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        int result = myMethod(3);
        System.out.println(result);
    }
}