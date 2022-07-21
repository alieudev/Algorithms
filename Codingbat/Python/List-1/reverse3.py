def reverse3(nums):
  # solution 1 (uncomment) 
  # return nums[::-1]
  
  # solution 2
  # output = []
  # for i in range(len(nums)-1, -1, -1): 
  #   output.append(nums[i]) 
  # return output 
  
  
  # solution 3 
  ans = [] 
  for num in reversed(nums): 
    ans.append(num)
  return ans
    
  
