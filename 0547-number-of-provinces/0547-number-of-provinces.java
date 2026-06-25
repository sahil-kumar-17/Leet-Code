class Solution {
      public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        Arrays.fill(visited, false);
        int province = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfsutil(i, visited,isConnected);
                province++;
            }
        }
        return province;
    }
  
  
  public void dfsutil(int start, boolean[] visited, int[][] isConnected) {
        visited[start] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[start][i] == 1 && !visited[i]) {
                dfsutil(i, visited,isConnected);
            }
        }
    }


}