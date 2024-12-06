class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] strArr=rny_string.split("");
        
        for (int i=0;i<strArr.length;i++){
            if(strArr[i].equals("m")){
                strArr[i]="rn";
            }
            answer +=strArr[i];
        }
        
        return answer;
    }
}