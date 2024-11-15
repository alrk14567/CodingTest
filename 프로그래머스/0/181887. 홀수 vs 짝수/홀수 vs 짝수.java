class Solution {
    public int solution(int[] num_list) {
        int sumOdd = 0;
        int sumeven = 0;
        int answer = 0;
        for (int i=0; i < num_list.length;i++){
            if (i==0 || i%2==0){
                sumOdd+=num_list[i];
            }else{
                sumeven+=num_list[i];
            }
        }
        if (sumOdd >= sumeven) {
            answer=sumOdd;
        }else {
            answer=sumeven;
        }
        
        return answer;
    }
}