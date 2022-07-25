class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int cnt = 0;
        int result = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if (!map.containsKey(target)) {
                map.put(target, 1);
            } else {
                map.put(target, map.get(target) + 1);
            } 
        }
        for (char key : map.keySet()) {
            int value = map.get(key);
            cnt += value / 2;
            if (value % 2 != 0) {
                flag = true;
            }
        }
        if (flag) {
            result = cnt * 2 + 1;
        } else {
            result = cnt * 2;
        }
        
        return result;
    }
}