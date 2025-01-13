import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        answer=numbers[numbers.length-1]*numbers[numbers.length-2];
        int temp=numbers[0]*numbers[1];
        
        if(answer<temp){
            answer=temp;
        }
        
        return answer;
    }
}