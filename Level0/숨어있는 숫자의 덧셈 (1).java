class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "123456789";
        
        for (int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i); // c로 my_string 문자열 1개마다 받기
            
            if (num.contains(String.valueOf(c))) { // num에 contains가 돼있냐 / String.valueOf(c) = c를 문자열로 변환
                answer += c - '0'; // c - '0'으로 아스키코드 값을 숫자로 변환
            }
        }
        return answer;
    }
}
