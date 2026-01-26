class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i=0; i<n; i++) {
            answer[i] = (long)x * (i+1);
            // x * (i+1)만 사용했을 때 테스트 케이스 13,14번 오류 발생
            // 원인: int 범위 오버플로우 (int 최대값: 약 21억)
            // 예: x=10000000, i=9일 때
            //     10000000 * 10 = 100000000 (int 범위 내)
            //     하지만 더 큰 값에서 int 계산 후 long 변환 시 이미 오버플로우 발생
            // 해결: (long)x로 먼저 형변환 후 곱셈
            //     → long * int = long 연산으로 오버플로우 방지
        }
        }
        return answer;
    }
}
