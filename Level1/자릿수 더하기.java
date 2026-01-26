import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int answer = 0;
        for (int i=0; i<num.length(); i++){
            answer += num.charAt(i) - '0';
            // 처음엔 answer += num[i] 로 접근했으나 배열이 아닌 문자열이라 [i] 형식이 안됐음.
            // num.charAt(i)-> char 타입으로 i번째 문자를 받음
            // - '0'; -> 문자를 숫자로 변경 / 아스키 코드로 인하여
            // char[]로 변환하면 배열처럼 사용 가능: num.toCharArray()[i]
        }
        System.out.println(answer);
        return answer;
    }
}
