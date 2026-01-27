class Solution {
    public int solution(int a, int b) {
        if (a%2!=0 && b%2!=0) { return a*a + b*b; }
        else if (a%2==0 && b%2==0) { return Math.abs(a-b); } // Math.abs() 절댓값 함수
        else { return 2*(a+b); }
    }
}
