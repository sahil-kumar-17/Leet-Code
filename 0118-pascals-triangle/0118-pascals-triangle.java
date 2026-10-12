class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            List<Integer>temp=new ArrayList<>();
            for(int col=1;col<=row;col++){
                temp.add(ncr(row-1,col-1));
            }
            ans.add(temp);
        }
        return ans;
    }
    private int ncr(int row,int col){
        long res=1;
        for(int i=0;i<col;i++){
            res=res*(row-i)/(i+1);
        }
        return (int)res;
    }
}