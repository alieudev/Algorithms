public boolean haveThree(int[] nums) {
  
  int count = 0;
  
  if(nums.length < 1) return false;
  
  for(int i=0; i<nums.length-1; i++){
    
    if(nums[i] == 3 && nums[i+1] == 3){
      return false;
      
    } else if (nums[i]== 3){
      count += 1; 
    }
  }
  
  if(nums[nums.length-1] == 3){
    count += 1; 
  }
  return count == 3;
}

