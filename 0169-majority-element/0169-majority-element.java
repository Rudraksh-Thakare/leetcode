class Solution {
    public int majorityElement(int[] nums) {
        HashSet<Integer> set=new HashSet();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }       
        for(int i:set)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                {
                    count++;
                }
            }
            if(count>(nums.length)/2)
            {
                return i;
            }
        }
        return 0;
    }
    

}