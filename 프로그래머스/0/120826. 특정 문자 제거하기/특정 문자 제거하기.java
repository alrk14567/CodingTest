class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] strArr=my_string.toCharArray();
        
        char[] letterArr = letter.toCharArray();
        for(int i=0;i<strArr.length;i++){
            if(strArr[i]==letterArr[0]){
                
            }else {
                answer+= strArr[i];
            }
        }
        return answer;
    }
}