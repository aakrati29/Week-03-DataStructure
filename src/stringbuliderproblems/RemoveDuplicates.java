package stringbuliderproblems;

import java.util.HashSet;

public class RemoveDuplicates {

    static String removeDuplicate(String str){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!hs.contains(ch)){
                sb.append(ch);
                hs.add(ch);
            }
        }
    return sb.toString();
    }
    public static void main(String[] args) {
        String str = "tit college";
        System.out.println(removeDuplicate(str));
    }
}
