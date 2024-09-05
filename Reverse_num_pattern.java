public class Reverse_num_pattern {
    static void print_number(int cur) {
        if (cur == 0) {
            return;
        }

        print_number(cur - 1);
        System.out.print(cur + " ");
    }

    static void pattern(int n) {
        if (n == 0) {
            return;
        }
        print_number(n);
        System.out.println();
        pattern(n - 1);
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
