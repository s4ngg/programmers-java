class Solution {
    public int solution(int n, String control) {
        
        for (int i=0; i<control.length(); i++) {
        char c = control.charAt(i); // 처음엔 charAt을 생각하지 않고 valueOf를 사용하였는데 valueOf는 문자열을 확인하는 것이 아닌 다른 자료형을 문자열로 변환하는 명령어.
            if (c == 'w') { n += 1; }
            else if (c == 's') { n -= 1; }
            else if (c == 'd') { n += 10; }
            else { n -= 10; }
        }
        return n;
    }
}
