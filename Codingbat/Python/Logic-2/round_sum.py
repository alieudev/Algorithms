def round_sum(a, b, c):
  total = 0
  for num in [a,b,c]: 
    total += round10(num)
  return total 
    
def round10(num):
  if num % 10 < 5: 
    return num - num % 10 
  else: 
    return 10 - num % 10  + num 
  
  

