def selectionSort(array):
	for i in range(len(array)):
		smallest = i 
		for j in range(i+1, len(array)): 
			if array[smallest] > array[j]: 
				smallest = j 
		array[smallest], array[i] = array[i], array[smallest]
	return array
				
