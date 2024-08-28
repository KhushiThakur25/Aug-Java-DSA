public class Name_recursion {
    static void print(int n) {
        // tremination condition for the recursion
        if (n == 0) {
            return;
        }
        System.out.println("Recursion");
        // updation and recursive call ...
        print(n - 1);

        System.out.println("Calling");
        System.out.println("hello");
    }

    public static void main(String[] args) {
        // initial call ..
        print(5);
    }
}
