class Solution {
    public String solution(String rsp) {
        char[] digits = rsp.toCharArray();
        String answer = "";
        for (int i=0; i< digits.length; i++) {
            switch(digits[i]){
                case '0':
                    answer+='5';
                    break;
                case '2':
                    answer+='0';
                    break;
                case '5':
                    answer+='2';
                    break;
            }
        }
             
        return answer;
    }
}