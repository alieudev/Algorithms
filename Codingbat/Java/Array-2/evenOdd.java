public int[] evenOdd(int[] nums) {
  int[] output = new int[nums.length]; 
  int j = nums.length-1; 
  int k = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] % 2 == 0){
      output[k] = nums[i];
      k++;
    } else {
      output[j] = nums[i];
      j--;
    }
  }
  return output;
}

