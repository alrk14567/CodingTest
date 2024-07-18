class Solution {
    public int solution(int hp) {
        int answer = 0;
        int genal=hp/5;
        hp=hp-genal*5;
        int soldier=hp/3;
        hp=hp-soldier*3;
        answer=genal+soldier+hp;
        return answer;
    }
}