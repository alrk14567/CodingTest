class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] check= new int[10];
        for (int i=0;i<10;i++) {
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]==i){
                    check[i]=1;
                }
            }
        }
        for (int i=0;i<10;i++){
            if (check[i]==0){
                answer+=i;
            }
        }
        
        return answer;
    }
}