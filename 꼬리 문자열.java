class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (String i : str_list) {
            if (!i.contains(ex)) {
                // i가 들어있지 않으면 추가를 해야하니 !i.contains()로 사용.
                answer += i;
            }
        } return answer;
    }
}
