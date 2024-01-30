package practice;

public class AlphabetPattern1 {
    public static void main(String[] args) {
        printAlphabetPattern();
    }

    static void printAlphabetPattern() {
        String firstWord = "SUNSHINES";
        String secondWord = "EASTSIDE";

        printPatternForWord(firstWord);
        System.out.println(); // Add a newline between patterns
        printPatternForWord(secondWord);
    }

    static void printPatternForWord(String word) {
        int length = word.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // Print two spaces for indentation
            }
            System.out.println(word.charAt(i));
        }
    }
}


