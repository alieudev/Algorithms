import math
def arrayOfProducts(array):
	output = [0] * len(array)
	for i in range(len(array)): 
		right = math.prod(array[i+1:])
		left = math.prod(array[:i])
		output[i] = int(right * left)
	return output
		
