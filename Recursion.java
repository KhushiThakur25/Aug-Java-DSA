public class Recursion {
    static void print_name(int n){
        //Base Case or Termination Case 
        if(n == 0){
            return;
        }
        //Logic For printing Name
        System.out.println("Riya");
        //Recursive Call with Small Problem
        print_name(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        //Initial Call 
        print_name(n);
    }
}
