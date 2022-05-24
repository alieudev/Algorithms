import math
def arrayOfProducts(array):
	output = [0] * len(array)
	for i in range(len(array)): 
		right = math.prod(array[i+1:])
		left = math.prod(array[:i])
		output[i] = int(right * left)
	return output

# Solution 2
def arrayOfProducts(array):
  products = [1 for _ in range(len(array))]
  for i in range(len(array)):
    runningProduct = 1 
    for j in range(len(array)):
      if i != j: 
        runningProduct *= array[j]
    products[i] = runningProduct
  return products

		
		
		
		
		
		
    
