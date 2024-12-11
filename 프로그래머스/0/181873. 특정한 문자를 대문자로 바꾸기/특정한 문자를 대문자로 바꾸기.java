class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] strArr=my_string.split("");
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals(alp)){
                answer+=strArr[i].toUpperCase();
            }else{
                answer+=strArr[i];
            }
        }
        return answer;
    }
}