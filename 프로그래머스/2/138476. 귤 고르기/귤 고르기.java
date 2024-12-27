import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int[] temp1 = new int[tangerine.length];
        for(int i=0;i<temp1.length;i++){
            temp1[i]=tangerine[i];
        }
        Arrays.sort(temp1);
        
        int[] com1 = new int[temp1[temp1.length-1]];
        for(int i=0; i<temp1.length;i++){
            com1[temp1[i]-1]++;
        }
        Arrays.sort(com1);
        
        int totalSum=0;
        for(int i=com1.length-1;i>=0;i--){
            totalSum+=com1[i];
            answer++;
            if(totalSum>=k){
                break;
            }
            
        }
        
        return answer;
    }
}