import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        
        for(int i=s.length() -1; i>= 0;i--){ //내림차순이라 length()부터 시작해 0까지 빼기.
            answer += ch[i];
        }
        
        return answer;
    }
}
