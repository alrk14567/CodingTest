class Solution {
    public int solution(int n) {
        int answer = 0;
        int index=0;
        
        while(index!=n){
            ++index;
            answer++;
            while((answer-3)%10==0 ||answer%3==0||(answer>29&&answer<40)||(answer>129&&answer<140)){
                answer++;
            }                        
            if(index==n){
                break;
            }
        }
        
        
        
        
        return answer;
    }
}