package practice;

public class NumPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printNumberPattern(n);
    }

    static void printNumberPattern(int n) {
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num += n - j - 1;
            }
            System.out.println();
        }
    }
}


