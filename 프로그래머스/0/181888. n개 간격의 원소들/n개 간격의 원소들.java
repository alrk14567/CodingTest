class Solution {
    public int[] solution(int[] num_list, int n) {
        int len =0;
        
        if(num_list.length%n==0){
            len=num_list.length/n;
        }else{
            len=num_list.length/n+1;
        }
        
        int[] answer = new int[len];
        int index=0;
        
        for (int i=0; i<answer.length;i++){
            answer[i]=num_list[index];
            index+=n; 
        }
        
        return answer;
    }
}