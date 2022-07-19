public boolean either24(int[] nums) {
  boolean two = false;
  boolean four = false;
    
  for(int i = 0; i<nums.length-1; i++){
    if(nums[i] == 2 && nums[i+1] == 2){
      two = true;
    }
      
    else if(nums[i] == 4 && nums[i+1] == 4)
      four = true;
  }
  if (two == true && four == true) return false;
  else if (two == false && four == false) return false;
  else return true;
}

