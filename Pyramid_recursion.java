public class Pyramid_recursion {
    static void space(int cur) {
        if (cur == 0) {
            return;
        }
        System.out.print("  ");
        space(cur - 1);
    }
    static void star(int cur) {
        if (cur == 0) {
            return;
        }
        System.out.print("* ");
        star(cur - 1);
    }
    static void pattern(int n, int cur) {
        if (cur > n)
            return;
        space(n - cur);
        star(2 * cur - 1);
        System.out.println();
        pattern(n, cur + 1);
    }

    public static void main(String[] args) {
        pattern(5, 1);
    }
}
