import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String numberString=Integer.toString(n);
        char[] charArr=numberString.toCharArray();
        int[] numbers=new int[charArr.length];
        
        for (int i=0;i<charArr.length;i++) {
            numbers[i]=Character.getNumericValue(charArr[i]);
            answer+=numbers[i];
        }
        

        

        return answer;
    }
}