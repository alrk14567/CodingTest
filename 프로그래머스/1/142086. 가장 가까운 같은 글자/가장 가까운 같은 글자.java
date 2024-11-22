class Solution {
    public int[] solution(String s) {
        char[] sArr = s.toCharArray();
        int[] answer = new int[sArr.length];
        
        for (int i=0; i<sArr.length;i++){
            answer[0]=-1;
            for (int j=0; j<i;j++){
                if(sArr[i]==sArr[j]){
                    answer[i]=i-j;
                }
            }
            if (answer[i]==0){
                answer[i]=-1;
            }
        }
        
        return answer;
    }
}