def insertionSort(array):
    for i in range(len(array)): 
		lowest = i 
		for j in range(i+1, len(array)): 
			if array[j] < array[lowest]: 
				lowest = j 
		array[lowest],array[i] = array[i], array[lowest]
	
	return array 

