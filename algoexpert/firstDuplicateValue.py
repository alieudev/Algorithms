def firstDuplicateValue(array):
	counter = {}
	for num in array: 
		if num in counter: 
			counter[num] += 1
			if  counter[num] == 2: 
				return num 
		else: 
			counter[num] = 1 
	return -1 
		
		
		
	

