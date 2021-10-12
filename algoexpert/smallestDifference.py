def smallestDifference(arrayOne, arrayTwo):
    smallest = float("inf")
	idx = []
	
	for i in arrayOne: 
		for j in arrayTwo: 
			currentDiff = abs(j - i)
			if currentDiff < smallest: 
				idx = [i, j]
			smallest = min(currentDiff, smallest)
	return idx

