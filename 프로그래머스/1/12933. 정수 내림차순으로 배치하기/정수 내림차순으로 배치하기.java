import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nStr = String.valueOf(n);
        String[] dgits = nStr.split("");//문자열 변환후 배열로
       
        Integer[] intDgits= Arrays.stream(dgits)
                                  .map(Integer::parseInt)
                                  .toArray(Integer[]::new);
        
        Arrays.sort(intDgits,Collections.reverseOrder());
        
        dgits = Arrays.stream(intDgits)
                      .map(String::valueOf)
                      .toArray(String[]::new);   // Stream -> String[];
        String result = String.join("", dgits);
                        
        answer= Long.parseLong(result);
        
        return answer;
    }
}