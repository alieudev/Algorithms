public int[] maxEnd3(int[] nums) {
  int highest = Math.max(nums[0], nums[nums.length-1]);
  
  return new int[] {highest, highest, highest};
}

