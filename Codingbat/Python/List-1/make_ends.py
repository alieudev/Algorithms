def make_ends(nums):
  if len(nums) == 1: 
    return [nums[0], nums[0]] 
  return [nums[0], nums[len(nums)-1]]

