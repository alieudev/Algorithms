def countInversions(array):
    invers = []
	for i in range(len(array)): 
		for j in range(i+1, len(array)): 
			if i < j and array[i] > array[j]: 
				invers.append(i)
	return len(invers)
				
