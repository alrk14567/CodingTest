class Solution {
    public String solution(int n) {
        String answer = "";
        String[] stringArr=new String[n];
        for (int i=0; i<n;i++) {
            if(i==0){
                stringArr[i]="수";
            } else if(i%2==1){
                stringArr[i]="박";
            } else {
                stringArr[i]="수";
            }
            answer+=stringArr[i];
        }
        
        return answer;
    }
}