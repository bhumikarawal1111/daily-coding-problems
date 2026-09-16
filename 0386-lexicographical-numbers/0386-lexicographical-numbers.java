class Solution {

    private static void solve(int n, int ans, List<Integer> list) {

        if (ans > n) {
            return;
        }

        list.add(ans);

        for (int i = 0; i <= 9; i++) {
            int num = ans * 10 + i;

            if (num > n)
                break;

            solve(n, num, list);
        }
    }

    public List<Integer> lexicalOrder(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            if (i > n)
                break;

            solve(n, i, list);
        }

        return list;
    }
}