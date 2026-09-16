class Solution {
       static String arr[] = {"","", "abc", "def" ,"ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
        public static void solve(String digits, String ans, List<String> list){
            if(digits.length() == 0){
                list.add(ans);
                return;
            }
            char ch = digits.charAt(0);
            String key = arr[ch - '0'];

            for (int i = 0; i < key.length(); i++) {
                solve(digits.substring(1), ans + key.charAt(i), list);
            }

        }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits.length() == 0)
            return list;
        
        solve(digits, "", list);

        return list;
    }
}