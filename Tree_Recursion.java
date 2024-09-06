public class Tree_Recursion {
    static void tree(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Pre call " + n);
        tree(n - 1);
        System.out.println("Mid call " + n);
        tree(n - 2);
        System.out.println("Post call " + n);
    }

    public static void main(String[] args) {
        tree(3);
    }
}
