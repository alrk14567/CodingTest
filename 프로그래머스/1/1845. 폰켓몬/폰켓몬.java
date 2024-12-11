import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] n=Arrays.stream(nums)
                        .distinct()
                        .toArray();
        answer= nums.length/2 >= n.length ? n.length:nums.length/2;
        
        return answer;
    }
}