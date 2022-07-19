public boolean more14(int[] nums) {
  int four = 0;
  int one = 0; 
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 4) four++;
    if(nums[i] == 1) one++;
  } 
  return four < one;
}

