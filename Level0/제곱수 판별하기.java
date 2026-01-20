class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n); // sqrt(x) = 제곱근 구하는 함수
        
        if (sqrt * sqrt == n){
            answer += 1;
        }
        else {
            answer += 2;
        }
        return answer;
    }
}
