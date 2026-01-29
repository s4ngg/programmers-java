class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        if (len % 2 == 0){
            answer = s.substring(len/2-1, len/2+1); 
            // substring(1,10) substring은 1~10까지 가져오는 함수 
        } else {
            answer = String.valueOf(s.charAt(len/2));
            // charAt은 char로 가져오는 것인데 반환타입이 String임
            // -> String.valueOf()로 가져오는 것
        }
        return answer;
    }
}
