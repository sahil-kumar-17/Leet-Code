class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[]visited =new boolean[rooms.size()];
        dfs(visited,rooms,0);
        for(boolean vis:visited){
            if(!vis)return false;
        }
        return true;
    }

    public void dfs(boolean[] visited, List<List<Integer>> rooms, int source) {
        visited[source] = true;
        for (int nodes : rooms.get(source)) {
            if (visited[nodes] != true) {
                dfs(visited, rooms, nodes);
            }
        }
    }
}