package sherman.dictionary;


public class Main {
    public static void main(String[] args) {

        Dictionary a2b = new Dictionary("Eng2Swe");

        //a2b.setKeyValuePair("food", "mat");
        //a2b.setKeyValuePair("water", "vatten");
        //a2b.setKeyValuePair("ocean", " sjö");
        //a2b.setKeyValuePair("land", "jord");

        System.out.println("Train the dictionary");
        System.out.println("--------------------");
        a2b.train();


        String d = a2b.loadDict();
        a2b.saveDict(d);


        System.out.println("\nPrint the dictionary");
        System.out.println(  "--------------------");
        System.out.print(a2b);

        System.out.println("\nLoad the dictionary file and save it");
        System.out.println(  "--------------------");
        String t = a2b.loadTranslate();
        a2b.saveTranslate(t);

        // the dictionary has been cleared
        System.out.println("\nTranslate a word");
        System.out.println(  "--------------------");
        System.out.print(a2b.toString());
        //System.out.print(a2b.loadTranslate());
        //System.out.println(a2b.translateWord("food"));

        System.out.print(a2b.translateSentence("food is goot? food, is goot!"));

    }
}
