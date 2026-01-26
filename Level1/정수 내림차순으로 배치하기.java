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


// string 메서드
// 특정 위치 문자가져오기 -> str.charAt();
// 문자열을 배열로 변환하기 -> char[] arr = str.toCharArray();
// 숫자를 문자열로 변환하기 -> String num = String.valueOf(123); -> 정수 123
// 특정 문자가 들어있는지 확인하기 -> str.contains("ll");  // true or false
// 문자열 자르기 -> str.substring(0, 2);  // 0번부터 2번 전까지, str.substring(2); 2번부터 끝까지

// StringBuilder sb = new StringBuilder();
// 1. 문자열 추가 (끝에 붙이기)
sb.append("hello");  // "hello"
sb.append(" ");      // "hello "
sb.append("world");  // "hello world"

// 2. 특정 위치에 삽입
sb.insert(5, "!!");  // "hello!! world"

// 3. 삭제
sb.delete(5, 7);  // "hello world" (5~7번 삭제)

// 4. 뒤집기
sb.reverse();  // "dlrow olleh"
