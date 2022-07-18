public int[] post4(int[] nums) {
  int idx = 0;
  for(int i = 0; i<nums.length; i++){
    if (nums[i] == 4) idx = i;
  }
  
  return Arrays.copyOfRange(nums, idx+1, nums.length);
}

