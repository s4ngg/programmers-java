class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            // Character.isUpperCase() / isLowerCase() 로 대,소문자 확인
            // Character.toUpperCase() / toLowerCase() 로 대,소문자 변환
            if (Character.isUpperCase(c)) { answer += Character.toLowerCase(c); }
            else { answer += Character.toUpperCase(c); }
        } return answer;
    } 
}
