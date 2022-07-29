public boolean no14(int[] nums) {
  boolean four = false;
  boolean one = false; 
  
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1) {
      four = true;
    }
    if(nums[i] == 4){
      one = true;
    }
    
  }
  return (four == false || one == false);
  
}

