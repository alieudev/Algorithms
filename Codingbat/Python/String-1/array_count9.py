def array_count9(nums):
  # return nums.count(9)
  
  nine = 0 
  for num in nums:
    if num == 9: 
      nine += 1 
  return nine 
