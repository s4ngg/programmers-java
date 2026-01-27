class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        
        for (int i=0; i<s.length();i++){
            char c =s.charAt(i);
            if (c == 'p' || c == 'P') {p_cnt++;}
            else if (c == 'y' || c == 'Y') {y_cnt++;}
        } 
        
        if (p_cnt != y_cnt) { answer = false; }
        return answer;
    }
}
//  s = s.toLowerCase();를 사용해서 전부 소문자 변환 -> 'p' or 'y' 로만 비교하는 케이스도 확인. 이런식으로 해도 좋을듯
