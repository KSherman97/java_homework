package cis231.sherman;

//imports for dictionary class
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    private HashMap<String, String> dictionaryVar = new HashMap<String, String>();
    private String name;

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

    public void save(){

    }

    public void load(){

    }

    public void translatefile (String name){

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
