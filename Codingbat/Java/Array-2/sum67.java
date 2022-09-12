public int sum67(int[] nums) {
  int total = 0; 
  boolean status = true;
  
 for(int i = 0; i<nums.length; i++){
   if(nums[i] == 6){
     status = false;
   } 
   
   if (status == true){
     total += nums[i];
   }
   
   if(nums[i] == 7) {
     status = true;
   }
 }
 return total;
}

