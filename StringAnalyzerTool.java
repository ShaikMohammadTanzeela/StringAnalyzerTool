import java.util.Scanner;

public class StringAnalyzerTool {

    // Function to count vowels and consonants
    public static int[] countVowelsAndConsonants(String sentence) {
        int vowels = 0, consonants = 0;
        String lower = sentence.toLowerCase();
        for (char ch : lower.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    // Function to count words
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Function to reverse each word in the sentence
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int[] counts = countVowelsAndConsonants(sentence);
        int wordCount = countWords(sentence);
        String reversedWords = reverseEachWord(sentence);

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Sentence with each word reversed: " + reversedWords);

        sc.close();
    }
}