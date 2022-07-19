public int[] pre4(int[] nums) {
  for(int i=0; i<nums.length; i++){
    if (nums[i] == 4)
      return Arrays.copyOfRange(nums, 0, i);
  }
  return new int[] {};
}

