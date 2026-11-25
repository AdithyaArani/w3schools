public class accessmodifiers {
    private int privateVar = 10; 
    protected int protectedVar = 20; 
    public int publicVar = 30; 

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    public static void main(String[] args) {
        accessmodifiers obj = new accessmodifiers();

        System.out.println("Private Variable: " + obj.privateVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Public Variable: " + obj.publicVar);

        obj.privateMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}
