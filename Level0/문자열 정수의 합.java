class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (char c : num_str.toCharArray()) {
            // 문자열을 문자열 배열로 바꿔주는 .toCharArray() 사용
            // 처음엔 Integer.parseInt로 사용해서 풀었으나 int의 범위가 벗어나 런타임에러 발생
            answer += c - '0';
        }
        return answer;
    }
}
