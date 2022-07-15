public int[] reverse3(int[] nums) {
  int [] reverse = new int [nums.length]; 
  int idx = 0;
  for(int i=nums.length-1; i>=0; i--){
    reverse[i] = nums[idx];
    idx++;
  }
  return reverse;
}

