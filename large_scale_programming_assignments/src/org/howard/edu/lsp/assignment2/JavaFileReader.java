/**
 * Name: Leilani Dexter
 */
package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class JavaFileReader {
    public static void main(String[] args) {
        String filePath = "words.txt";
        Map<String, Integer> wordCounts = countWords(filePath);
        printWordCounts(wordCounts);
    }

    private static Map<String, Integer> countWords(String filePath) {
        Map<String, Integer> wordCounts = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (isValidWord(word)) {
                        word = word.toLowerCase();
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCounts;
    }

    private static boolean isValidWord(String word) {
        if (word.length() <= 3) {
            return false;
        }
        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    private static void printWordCounts(Map<String, Integer> wordCounts) {
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
