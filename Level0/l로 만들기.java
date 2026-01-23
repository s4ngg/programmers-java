class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char a = myString.charAt(i); 
            if (a <= 'l') { answer += 'l'; } // 문자비교는 가능하지만 문자'열'비교는 안됨.
            else { answer += a; }
        }
        return answer;
        }      
}
