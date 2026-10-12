class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer>temp=genRow(i);
            ans.add(temp);
        }
        return ans;
    }
    private List<Integer>genRow(int row){
        List<Integer>ans=new ArrayList<>();
        ans.add(1);
        long res=1;
        for(int i=1;i<row;i++){
            res=res*(row-i);
            res=res/(i);
            ans.add((int)res);
        }
        return ans;
    }
}