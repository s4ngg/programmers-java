class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a = String.valueOf(num);
        char target = (char)(k + '0'); // 문자를 정수형으로 바꾸기. k = 3 + '0' = 48 = 51 -> 아스키코드 51 = 3
      
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i) == target) {
                return i+1;
            }
        }
        return -1;
    }
}
