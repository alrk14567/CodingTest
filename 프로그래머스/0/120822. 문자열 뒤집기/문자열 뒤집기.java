class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] my_string1= my_string.toCharArray();
        for(int i=my_string1.length-1;i>=0;i--){
            answer+=my_string1[i];
        }
        return answer;
    }
}