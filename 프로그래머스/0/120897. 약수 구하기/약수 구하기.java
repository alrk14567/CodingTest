import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        for(int i=2;i<n/2+1;i++){
            if(n%i==0){
                answer.add(i);
            }
        }
        if(n!=1){
            answer.add(n);
        }
        
        
        return answer;
    }
}