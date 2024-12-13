class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
      
        int index1=0;
        int index2=0;
        for (int i=0;i<num_list.length;i++){
            if(num_list[i]%2==1){
                index1++;
            }else{
                index2++;
            }
        }
        for(int i=0;i<num_list.length;i++){
             if(num_list[i]%2==1){
                answer+=num_list[i]*(Math.pow(10,--index1));
            }else{
                 answer+=num_list[i]*(Math.pow(10,--index2));
             }
        }
        
        
        return answer;
    }
}