package practice;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printNumberPattern(n);
    }

    static void printNumberPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print(Math.max(Math.abs(n - i - 1), Math.abs(n - j - 1)) + 1 + " ");
            }
            System.out.println();
        }
    }
}

