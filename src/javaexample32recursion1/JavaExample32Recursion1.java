package javaexample32recursion1;

public class JavaExample32Recursion1 {

    public static void main(String[] args) {
        
        PrintDashEndsNewLine(40);
        System.out.println("Recursion");

    }

    private static void PrintDash(int n) {
        if (n < 1) {
            return;
        } else {
            System.out.print("-");
            PrintDash(n - 1);
        }
    }
    private static void PrintDashEndsNewLine(int m)
    {
        PrintDash(m);
        System.out.println();
    }

}
