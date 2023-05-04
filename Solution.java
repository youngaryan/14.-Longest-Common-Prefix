import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<Character> list = new ArrayList<>();
        List<Character> listC = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i].charAt(0));
        }
        for (int i = 0; i < strs.length; i++) {
            for (int j = i; j < strs.length; j++) {
                if (list.get(i) != list.get(j))
                    continue;
                else{
                    listC.add(list.get(i));
                    break;
                }
            }
        }
        if (listC.isEmpty())return "";
        throw new RuntimeException(String.valueOf(listC));

        //return null;
    }
}
