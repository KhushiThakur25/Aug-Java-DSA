public class Space_Tri_recursion {
    static void space(int cur) {
        if (cur == 0) {
            return;
        }
        System.out.print("  ");
        space(cur - 1);
    }
    static void star(int cur) {
        if (cur == 0)
            return;
        System.out.print("* ");
        star(cur - 1);
    }
    static void pattern(int n, int cur) {
        if (n == 0) {
            return;
        }     
        pattern(n - 1, cur);
        space(cur - n);
        star(n);
        System.out.println();      
    }

    public static void main(String[] args) {
        pattern(5, 5);
    }
}
