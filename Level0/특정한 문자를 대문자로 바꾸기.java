class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (char c : my_string.toCharArray()) { // my_string은 문자열이라 toCharArray()로 배열로 변환해서 사용해야한다.            
            if (String.valueOf(c).equals(alp)) 
            {
                answer += Character.toUpperCase(c);
            } else {
                answer += my_string.valueOf(c);
            }
        }
        return answer;
    }
}
