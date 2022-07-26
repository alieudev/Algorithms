def make_chocolate(small, big, goal):
  if (big * 5) + small < goal: 
    return -1 
  
  if goal % big > small: 
    return -1 
  
  if goal % 5 > small: 
    return -1 
    
  if big * 5 > goal: 
    return goal % 5
  
  return goal - big * 5 
