class Solution {
    public int solution(int num) {
        long n = num; // 처음에 long으로 변환하지 않고 사용해서 오류발생. 오버플로우 때문에 long로 형변환
        int answer = 0;
        while (n != 1){
            if (n % 2 == 0){
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            answer ++;
        }
        return answer >= 500 ? -1 : answer;
    }
}
