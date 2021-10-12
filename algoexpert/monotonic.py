def isMonotonic(array):
	if len(array) < 2: 
		return True
	
	decreasing = False
	increasing = False
	
	for idx in range(len(array)-1): 
		if array[idx] > array[idx+1]: 
			decreasing = True
		else: 
			increasing = True
			
	if decreasing: 
		for i in range(len(array)-1): 
			if array[i] < array[i+1]: 
				return False 
	else: 
		for i in range(len(array)-1): 
			if array[i] > array[i+1]: 
				return False 
	return True
				
		
