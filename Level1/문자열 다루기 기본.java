class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i=0; i<s.length();i++){
            if (!Character.isDigit(s.charAt(i))) {// isDigit()은 Char형식이라 charAt로 변환
                return false;
            } else {
                if (s.length() != 4 && s.length() != 6){
                    return false;
                }
            }
        }
        return answer;
    }
}
