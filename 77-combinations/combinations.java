class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        func(n, k, ans, list);

        return ans;
    }

    private void func(int n, int k, List<List<Integer>> ans, List<Integer> list) {

        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        int element = list.isEmpty() ? 1 : list.get(list.size() - 1) + 1;

        for (int i = element; i <= n; i++) {
            list.add(i);

            func(n, k, ans, list);

            list.remove(list.size() - 1);
        }
    }
}