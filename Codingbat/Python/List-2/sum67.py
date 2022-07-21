def sum67(nums):
  status = True 
  total = 0 
  
  for num in nums: 
    if num == 6: 
      status = False 
    
    if status == True: 
      total += num 
      
    if num == 7: 
      status = True 
      
  return total 
