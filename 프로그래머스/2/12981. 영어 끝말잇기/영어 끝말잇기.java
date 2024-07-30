import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> seenWords = new HashSet<>(); // 이전에 사용된 단어를 추적하기 위한 Set
        seenWords.add(words[0]); // 첫 단어는 자동으로 추가

        for (int i = 1; i < words.length; i++) {
            // 현재 단어의 첫 글자와 이전 단어의 마지막 글자가 일치하는지 확인
            if (!words[i].startsWith(String.valueOf(words[i - 1].charAt(words[i - 1].length() - 1)))
                    || seenWords.contains(words[i])) {
                // 규칙 위반 시: 현재 차례의 사람 번호와 차례 회차 계산
                answer[0] = (i % n) + 1; // 사람 번호 계산 (1번부터 시작)
                answer[1] = (i / n) + 1; // 차례 회차 계산 (1회차부터 시작)
                return answer;
            }

            // 단어 목록에 현재 단어 추가
            seenWords.add(words[i]);
        }

        // 규칙 위반이 없으면 [0, 0] 반환
        answer[0] = 0;
        answer[1] = 0;
        return answer;
    }
}