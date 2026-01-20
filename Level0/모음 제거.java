class Solution {
    public String solution(String my_string) {
        String answer = "";
        String aeiou = "aeiou";
        for (int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i); // 문자열 c를 [i] 처럼 1개씩 입력받음
            if (aeiou.indexOf(c) == -1){ // indexOf(c)로 a~u까지 입력받는데 -1은 존재하지 않으니  answer += 됨.
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
