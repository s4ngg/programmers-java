class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x); // 숫자를 문자열로 변환하기 valueOf(x)
        int sum = 0;
        
        for (int i=0; i<str.length(); i++){
            sum += str.charAt(i) - '0'; // 문자를 숫자열로 변환하기 charAt(i) - '0'
        }
        
        return (x % sum == 0 ? true : false);
    }
}
