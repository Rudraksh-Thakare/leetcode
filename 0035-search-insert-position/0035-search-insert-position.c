int searchInsert(int* nums, int numsSize, int target) {
    int val=0;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]<=target)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else
            {
                val++;
            }
        }
        
    }   
    return val;
}