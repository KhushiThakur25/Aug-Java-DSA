public class Count_Data {
    public static void count_n(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        count_n(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        count_n(5);
    }
}
