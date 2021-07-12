def binarySearch(array, target):
    
	
	while (len(array) != 0): 
		midPoint = int(len(array) / 2)
		firstHalf = array[:midPoint]
		secondHalf = array[midPoint:]
		
		if array[midPoint] == target: 
			return midPoint
		
		if target > midPoint: 
			array = firstHalf
			midpoint = len(array)/2
		else: 
			array = firstHalf
			midpoint = len(array)/2
			
