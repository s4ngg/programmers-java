class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;  
                // 가장 작은 i를 찾으면 바로 반환
                // return을 만나면 함수는 그 즉시 종료
            }
        }
        return 0; // 못 찾은 경우 (문제 조건상 발생 안 함)
    }
}
