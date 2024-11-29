class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] strArr=my_string.toCharArray();
        for (int i=0;i<strArr.length;i++){
            if(strArr[i]<94){
                strArr[i]=Character.toLowerCase(strArr[i]);
            }else {
                strArr[i]=Character.toUpperCase(strArr[i]);
            }
        }
        answer= new String(strArr);
        
        
        return answer;
    }
}