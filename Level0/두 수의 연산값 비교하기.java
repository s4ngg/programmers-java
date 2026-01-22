class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a2 = String.valueOf(a);
        String b2 = String.valueOf(b);
        int ab = Integer.parseInt(a2+b2); // Injteger.parseInt로 문자열을 정수로 형변환
        return (ab >= 2*a*b ? ab : 2*a*b);
    }
}
