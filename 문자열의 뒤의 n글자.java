class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i=my_string.length()-n; i<my_string.length();i++){
            answer += my_string.charAt(i);
        } // String answer = str.substring(my_string.length()-n);
        // str.substring(6)이면 문자열 6번부터 출력
        // str.substring(1,5)면 1~5인덱스 문자열 출력
        return answer;
    }
}
