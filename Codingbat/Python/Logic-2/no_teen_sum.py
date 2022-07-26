def no_teen_sum(a, b, c):
  nums = [a,b,c]
  return sum([fix_teen(num) for num in nums])
  
def fix_teen(n):
  if n == 15 or n == 16: 
    return n
  if n <= 12 or n >= 20: 
    return n 
  return 0
