class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (long i=a; i<=b; i++){
                answer += i;}
        }
        else if (a > b) {
            for (long i=b; i<=a; i++){
                answer += i;
                }
            } else {
                answer += a;
            }
        return answer;
    }
}
// Math 메서드를 이용한 풀이
    // long answer = 0;
    // int start = Math.min(a,b);
    //int end = Math.max(a,b);
        
    //for (long i=start; i<=end; i++){
    //     answer += i;
    // }
    //     return answer;
    // }
