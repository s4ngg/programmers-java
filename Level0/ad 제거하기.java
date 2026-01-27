class Solution {
    public String[] solution(String[] strArr) { 
        int idx = 0;
        for(String s: strArr) {
            if (!s.contains("ad")) idx ++;
        }
        
        String[] answer = new String[idx];
        idx = 0;
        
        for(String s: strArr) {
            if (!s.contains("ad")) {
                answer[idx] = s;
                idx ++;
            }
        }
        
        return answer;
    }
}

// ArrayList<String> al = new ArrayList<>(); // 배열의 크기 동적으로 설정해서 사용

//         for (String s : strArr) {
//             if (!s.contains("ad")) {
//                 al.add(s);
//             }
//         }
//         return al.toArray(String[]::new);
