package practice;

public class AlphabetPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printAlphabetPattern(n);
    }

    static void printAlphabetPattern(int n) {
        char currentChar = 'A';

        for (int i = 0; i <n; i++) {
            	for (int j = 0; j <=i; j++) {
                    System.out.print(currentChar + " ");
                    currentChar++;
                }
            for (int k = 0; k <=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


