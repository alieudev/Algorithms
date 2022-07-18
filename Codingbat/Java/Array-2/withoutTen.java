public int[] withoutTen(int[] nums) {
  int[] output = new int[nums.length];
  Arrays.fill(output, 0);
  int j = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] != 10){
      output[j] = nums[i];
      j++;
    } 
  }
  return output;
}

