import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(int i=0;i<dic.length;i++){
            Boolean[] check=new Boolean[spell.length];              
            Arrays.fill(check, false); // 초기값 설정
            
            for(int j=0;j<spell.length;j++){                
                if(dic[i].contains(spell[j])){
                    check[j]=true;
                }
            }
            if (Arrays.stream(check).allMatch(c->c)){
                return 1;
            }
        }
        
        return 2;
    }
}