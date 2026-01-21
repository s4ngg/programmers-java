import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) { 
        int count = 0; // 문자열 안에 숫자가 몇개 있나 찾는 과정
        for (int i=0; i<my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                count ++;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0; // answer[0]의 위치 설정
        for (int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                answer[idx] = c - '0'; // 문자열 숫자 만들기
                idx ++;
            }
        } Arrays.sort(answer);
        return answer;
    }
}
