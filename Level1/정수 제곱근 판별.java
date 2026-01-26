class Solution {
    public long solution(long n) {
        for (long i=1; i*i <= n; i++) { // 조건을 i<=n으로 설정했었는데 그럼 범위가 너무 커서 i*i로 수정
            if (i*i == n) { 
            return (i+1) * (i+1);
            }
        }
        return -1;
    }
}
// long sqrt = (long)Math.sqrt(n);  제곱근 계산
// 제곱수인지 확인
// if (sqrt * sqrt == n) {
//     return (sqrt + 1) * (sqrt + 1); 
// }
