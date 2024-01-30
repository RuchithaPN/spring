package practice;

public class Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printPattern(n);
    }

   public static void printPattern(int n) {
	   for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print((i + j) % n + 1 + " ");
	        }
	        System.out.println();
	    }
   }
}
