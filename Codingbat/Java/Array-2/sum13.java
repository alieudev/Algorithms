public int sum13(int[] nums) {
  int total = 0; 
  
  if (nums.length < 1) return 0;
  
  for(int i=0; i<nums.length; i++){
    if(nums[i] != 13)
      total += nums[i];
    else if (nums[i] == 13 && i < nums.length -1){
      nums[i] = 0; 
      nums[i+1] = 0; 
    }
  }
  return total; 
}

