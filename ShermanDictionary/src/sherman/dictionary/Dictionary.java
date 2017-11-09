package sherman.dictionary;

//imports for dictionary class
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    private HashMap<String, String> dictionaryVar = new HashMap<String, String>();
    private String name;
    private static String dFileName = "C:\\Users\\3413.INSTRUCTION.009\\Desktop\\java_homework-master\\java_homework-master\\ShermanDictionary\\src\\sherman\\dictionary\\dictionary.txt";
    private static String sourceFileName = "C:\\Users\\3413.INSTRUCTION.009\\Desktop\\java_homework-master\\java_homework-master\\ShermanDictionary\\src\\sherman\\dictionary\\source.txt";
    private static String translateFileName = "C:\\Users\\3413.INSTRUCTION.009\\Desktop\\java_homework-master\\java_homework-master\\ShermanDictionary\\src\\sherman\\dictionary\\translate.txt";

    public Dictionary(){
        this.dictionaryVar = new HashMap<String, String>();
        this.name = "<noname>";
    }

    public Dictionary(String name){
        this();
        this.name = name;
    }

    public String toString(){
        String result = "Dictionary " + this.name + " \n";

        for (String key : this.dictionaryVar.keySet()) {
            String value = this.dictionaryVar.get(key);
            //System.out.println(key + ":" + value);
            result = result.concat(key + ":" + value +" \n") ;
        }
        return result;
    }

    public void train() {
        int ct = 0;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.printf("Key:");
            String key = in.nextLine();
            if(key.isEmpty()) {
                System.out.print(this);
                break;
            }
            System.out.printf("Value:");
            String value = in.nextLine();
            this.setKeyValuePair(key, value);
        }
    }

    public String translateWord(String word) {
        // return untrans if not in dict
        return ( keyExists(word) ? getValue(word): word) ;
    }

    public String translateSentence(String sentence){
        String result = new String("translation:");

        return result;
    }

    public void saveDict(String t){
        System.out.print("saving file");
        try{
            FileWriter fw = new FileWriter(this.sourceFileName);
            fw.write(t);
            fw.close();
        } catch (Exception e){
            System.out.print(e.toString());
            return;
        }
    }

    public String loadDict(){
        Scanner fs = null;
        StringBuilder t2 = new StringBuilder("");
        try{
            fs = new Scanner(new FileReader(this.dFileName)).useDelimiter(",");
            //this.dictionaryVar.clear();
            while(fs.hasNext()){
                String k = fs.next();
                String v = fs.next();

                //t2.append(k +","+v + "");
                this.dictionaryVar.put(k,v);
                t2.append(this.dictionaryVar + " ");
            }
        }
        catch(Exception e){
            System.out.println("Load " + this.dFileName + " File failed!");
            System.out.println(e);
        }

        return t2.toString();
    }

    public String loadTranslate() {
        Scanner fs = null;
        // String t1 = "";
        StringBuilder t2 = new StringBuilder("");
        try{
            fs = new Scanner(new FileReader(this.sourceFileName)).useDelimiter(",");
            //this.dictionaryVar.clear();
            while(fs.hasNext()){
                String word = fs.next();
                t2.append(translateWord(word) + " ");
                //System.out.print(this.translateWord(word));
            }
        }
        catch(Exception e){
            System.out.println("Load " + this.sourceFileName + " File failed!");
            System.out.println(e);
        }

        return t2.toString();
    }

    public void saveTranslate(String t){
        System.out.print("saving file");
        try{
            FileWriter fw = new FileWriter(this.translateFileName);
            fw.write(t);
            fw.close();
        } catch (Exception e){
            System.out.print(e.toString());
            return;
        }
    }

    public boolean keyExists(String key) {
        return this.dictionaryVar.containsKey(key);
    }

    public String getValue(String key){
        return (keyExists(key) ? this.dictionaryVar.get(key) : null);
    }

    public void setKeyValuePair(String key, String value){
        this.dictionaryVar.put(key, value);
    }

    public static void main(String[] args){

    }
}
