import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase(); // Character.을 안쓰는 것은 이미 문자열이기 때문에 그대로 사용
        
        char[] arr = answer.toCharArray(); // answer을 배열화 / .toCharArray
        Arrays.sort(arr);
        answer = new String(arr);
        
        return answer;
    }
}
