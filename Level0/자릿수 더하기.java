class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n>0){
            answer += n%10; // n을 10으로 나누면 가장 작은 자릿수의 값 추출(나머지)
            n /= 10; // 몫을 값으로 변환
        }
        return answer;
    }
}
