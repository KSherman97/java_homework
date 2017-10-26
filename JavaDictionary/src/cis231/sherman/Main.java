package cis231.sherman;

public class Main {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary("Eng2Swe");

        dictionary.setKeyValuePair("food", "mat");
        dictionary.setKeyValuePair("water", "vatten");
        dictionary.setKeyValuePair("ocean", " sjö");
        dictionary.setKeyValuePair("land", "jord");

        System.out.println("Train the dictionary");
        System.out.println("--------------------");
        dictionary.train();

        System.out.println("\nPrint the dictionary");
        System.out.println(  "--------------------");
        System.out.print(dictionary);

        System.out.println("\nTranslate a word");
        System.out.println(  "--------------------");
        System.out.println(dictionary.translateWord("food"));

        System.out.print(dictionary.translateSentence("food is goot? food, is goot!"));
    }
}
