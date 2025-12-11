class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length()-1; i >= 0; i--)
        {
            answer += my_string.charAt(i); // 자바는 문자열을 배열처럼 접근 x, charAt() 메서드 사용
        }
        return answer;
    }
}
