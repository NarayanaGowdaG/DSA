class Solution {
    public List<String> generateParenthesis(int n) {
 List<String> result = new ArrayList<>();
    generate(0, 0, n, "", result);
    return result;
         }
         private void generate(int open, int close, int n, String current, List<String> result) {
    if (open > n) {
      return;
    }
    if (open == close && open + close == 2 * n) {
      result.add(current);
      return;
    }
    generate(open + 1, close, n, current + '(', result);
    if (open > close) {
      generate(open, close + 1, n, current + ')', result);
    }
  }
}