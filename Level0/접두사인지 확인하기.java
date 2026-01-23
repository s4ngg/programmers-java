class Solution {
    public int solution(String my_string, String is_prefix) {
        
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.substring(0,i).equals(is_prefix)) {
                // substring(0,i)로 0~1 0~2 0~3 0~4 를 전부 확인하면서 equals로 확인
                return 1;
            }
        }
        return 0;
    }
}
