class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++){
            // i=0으로 시작하면 아래 if 조건문에서 n%0이 되기 때문에 오류가 발생한다.
            if (n%i==0) {
                answer += i;
            }
        }
        return answer;
    }
}
