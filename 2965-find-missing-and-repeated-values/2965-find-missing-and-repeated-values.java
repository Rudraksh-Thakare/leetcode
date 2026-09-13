class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet();
        int arr[]=new int [2];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(!set.add(grid[i][j]))
                {
                    arr[0]=grid[i][j];
                }
            }
        }
        int sum=0;
        int add=(grid.length)*(grid.length);
        add=(add*(add+1))/2;
        for(int i:set)
        {
            sum+=i;
        }
        if(sum-add!=0)
        {
            arr[1]=add-sum;
            return arr;
        }
        return new int[0];
    }

}