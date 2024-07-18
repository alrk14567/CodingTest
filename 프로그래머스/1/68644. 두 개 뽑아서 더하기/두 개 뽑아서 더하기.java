import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> sums= new HashSet<>();
        
        for(int i=0; i<numbers.length-1;i++) {
            for (int j=i+1; j<numbers.length;j++) {
                sums.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = sums.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}