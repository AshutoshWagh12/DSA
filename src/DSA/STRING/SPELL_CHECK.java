package DSA.STRING;

import java.util.ArrayList;
import java.util.List;

public class SPELL_CHECK {

    public static String SpellChecker(String[] dictionary, String sentence) {

        List<String> dictList = new ArrayList<>();

        for (String word : dictionary) {
            dictList.add(word.toLowerCase());
        }

        String[] words = sentence.split("\\s+");

        if (words.length <= 1) {
            return "Invalid input";
        }

        StringBuilder correctedSentence = new StringBuilder();

        for (String word : words) {
            String correctedWord = correctSpelling(word, dictList);
            if (correctedWord != null) {
                correctedSentence.append(correctedWord).append(" ");
            } else {
                correctedSentence.append(word).append(" ");
            }
        }

        String finalOutput = correctedSentence.toString().trim().replaceAll("\\s+", " ");
        return finalOutput.isEmpty() ? "Invalid input" : finalOutput;
    }

    public static String correctSpelling(String word, List<String> dictionary) {
        for (String dictWord : dictionary) {
            if (isSimilar(word, dictWord)) {
                return dictWord;
            }
        }
        return null;
    }

    public static boolean isSimilar(String word1, String word2) {
        return word1.length() == word2.length() && calculateDifference(word1, word2) == 1;
    }

    public static int calculateDifference(String str1, String str2) {
        int difference = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (Character.toLowerCase(str1.charAt(i)) != Character.toLowerCase(str2.charAt(i))) {
                difference++;
            }
        }
        return difference;
    }

    public static void main(String[] args) {
        String[] dictionary = {"environment", "always", "protect", "irreplaceable",
                "different", "absolutely", "greatest", "glory", "predictable", "flavor", "should", "or"};

        String sentence = "We should protect   our envaronment   alwoys";
//        String sentence = "This";

        String correctedSentence = SpellChecker(dictionary, sentence);
        System.out.println("Corrected sentence: " + correctedSentence);
    }

}
