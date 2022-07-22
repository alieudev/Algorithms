def make_bricks(small, big, goal):
  if goal > small + big * 5: 
    return False 
  
  if goal % 5 > small: 
    return False 
  
  return True
