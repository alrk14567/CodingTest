class Solution {
    public int solution(int n) {
        
        int answer= 0;
        int sum=0;
        int a=1;
        
        for (int i=a; i<n;i++){
            sum+=i;
            if(sum==n){               
                answer++;
                i=++a;
                sum=0;             
            } else if(sum > n){
                i=++a;
                sum=0;
            } 
        }
        return answer+1;
    }
}