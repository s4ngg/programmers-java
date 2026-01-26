import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n); // String.valueOf(n) 으로 n을 문자열로 변환
        char[] arr = str.toCharArray(); // char[] = str.toCharArray()로 str을 배열로 변환
        
        Arrays.sort(arr);  
        
        StringBuilder sb = new StringBuilder(new String(arr)); //배열 뒤집기 (내림차순으로 만들기)
        sb.reverse(); 
 
        long answer = Long.parseLong(sb.toString()); //String → long 변환
        return answer;
    }
}
