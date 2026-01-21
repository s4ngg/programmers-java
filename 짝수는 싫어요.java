class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; // n/2를 하면 홀수 일때 문제가 생겨서 (n+1)/2로 올림처리
        int index = 0;
        
        for (int i=1; i<=n;i++) { // i가 1부터 시작해야 마지막 배열이 안빠짐
            if (i%2 != 0) {
                answer[index] = i; // i가 1시작이라 index로 값 먹임
                index ++;
            }
        }
        return answer;
    }
}
