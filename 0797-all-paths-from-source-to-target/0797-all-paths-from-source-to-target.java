class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> G = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int edge : graph[i]) {
                G.get(i).add(edge);
            }
        }
        int start = 0;
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Dfs(start, path, ans, G);
        return ans;
    }

    public void Dfs(int start, List<Integer> path, List<List<Integer>> ans, List<List<Integer>> G) {
        int current = start;
        path.add(current);
        List<Integer> temp = new ArrayList<>(path);
        if (current == G.size() - 1) {
            ans.add(temp);
        } else {
            for (int edge : G.get(current)) {
                Dfs(edge, path, ans, G);
            }
        }
        path.remove(path.size()-1);
    }
}