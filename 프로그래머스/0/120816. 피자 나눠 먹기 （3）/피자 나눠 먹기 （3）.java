class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(slice/n>=1){
            answer=1;
        }else {
            for(int i=2;;i++){
                if((i*slice)/n>=1){
                    answer=i;
                    break;
                }
            }
        }
        return answer;
    }
}