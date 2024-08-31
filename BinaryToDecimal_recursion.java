public class BinaryToDecimal_recursion {
    static int binaryToDeci(int binary, int power) {
        if (binary == 0) {
            return 0;
        }
        return (binary % 10) * (int) Math.pow(2, power) + binaryToDeci(binary / 10, power + 1);
    }

    public static void main(String[] args) {
        int binaryNum = 1001;
        int result = binaryToDeci(binaryNum, 0);
        System.out.println("Binary:" + binaryNum + "->" + "decimal is:" + result);
    }
}
