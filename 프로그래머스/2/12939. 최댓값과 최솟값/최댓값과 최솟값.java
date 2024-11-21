import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr=s.split(" ");
        
        int[] intArr=Arrays.stream(sArr)
                           .mapToInt(Integer::parseInt)
                           .toArray();
        Arrays.sort(intArr);
        
        answer =String.valueOf(intArr[0]) +" "+ String.valueOf(intArr[intArr.length-1]);
        
        return answer;
    }
}