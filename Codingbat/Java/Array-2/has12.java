public boolean has12(int[] nums) {

  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1){
      if(has2(Arrays.copyOfRange(nums, i, nums.length))) return true;
    }
  }
  return false;
}

public boolean has2(int[] nums){
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 2) return true;
  }
  return false;
}

