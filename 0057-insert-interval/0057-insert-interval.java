class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int ans[][]={{newInterval[0],newInterval[1]}};
            return ans;
        }
        int makeShift[][]=new int[intervals.length+1][intervals[0].length];
        for(int i=0;i<intervals.length;i++){
                makeShift[i]=intervals[i];
            
        }
        makeShift[intervals.length]=newInterval;
        Arrays.sort(makeShift,(a,b)->a[0]-b[0]);

        List<int[]>mylist=new ArrayList<>();
        int []curr=makeShift[0];
        for(int i=1;i<makeShift.length;i++){
            if(curr[1]>=makeShift[i][0]){
                curr[1]=Math.max(curr[1],makeShift[i][1]);
            }else{
                mylist.add(curr);
                curr=makeShift[i];
            }
        }
        mylist.add(curr);
        return mylist.toArray(new int [mylist.size()][]);
    }
}