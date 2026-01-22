class Solution {
    public int solution(int a, int b) { 
        int answer = 0;
        String num = String.valueOf(a);
        String num2 = String.valueOf(b);
        
        int ab = Integer.parseInt(num+num2);
        int ba = Integer.parseInt(num2+num);
        
        return (ab > ba ? ab : ba); // public int 메서드가 int형이라 ab, ba 추가해서 작성
    }
}
