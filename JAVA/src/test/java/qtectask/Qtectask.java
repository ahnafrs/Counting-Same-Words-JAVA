package qtectask;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Qtectask {
    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line of text:");

        while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            String[] words = line.split("[\\s.,;!?]+");

            for (String word : words) {
                String cleanedWord = word.toLowerCase();
                wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
