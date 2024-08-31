public class SquarePattern_recursion {
    // static void printStar(int cur) {
    //     if (cur == 0) {
    //         return;
    //     }
    //     System.out.print("* ");
    //     printStar(cur - 1);
    // }

    // static void pattern(int n,int i) {
    //     // int cur = 5;
    //     if (n == 0) {
    //         return;
    //     }
    //     printStar(i);
    //     System.out.println();
    //     pattern(n - 1,i+1);
    // }

    static void printStar(int cur) {
        if (cur == 0) {
            return;
        }
        System.out.print("* ");
        printStar(cur - 1);
    }
    static void pattern(int n) {
        // int cur = 5;
        if (n == 0) {
            return;
        }
        pattern(n - 1);
        printStar(n);
        System.out.println();
        
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
