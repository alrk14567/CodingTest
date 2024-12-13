class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] temp =myString.split("");
        for(int i=0;i<temp.length;i++){
            answer+=temp[i].toUpperCase();
        }
        return answer;
    }
}