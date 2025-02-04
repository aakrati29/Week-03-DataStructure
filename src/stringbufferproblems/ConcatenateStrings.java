package stringbufferproblems;

import java.sql.SQLOutput;

public class ConcatenateStrings {

    static String concatenate(String string[]){
        StringBuffer sb = new StringBuffer();

        System.out.println("---------Seven values of capgemini----------");
        for(int i = 0; i < string.length; i++){
            sb.append(string[i]+ " ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String string[] = {"Honesty", "Boldness", "Trust", "Freedom", "Boldness", "Fun", "Modesty"};
        System.out.println(concatenate(string));
    }
}
