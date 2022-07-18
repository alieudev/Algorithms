def sum13(nums):
  total = 0 
  
  for i in range(len(nums)):
    if nums[i] != 13: 
      total += nums[i] 
    elif nums[i] == 13 and i < len(nums)-1: 
      nums[i] = 0
      nums[i+1] = 0 
  return total 
  
