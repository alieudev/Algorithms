def bubbleSort(array):
	temp = 1
    for i in range(0, len(array)): 
		for j in range(0, len(array)- temp):
			if array[j] > array[j+1]: 
				array[j], array[j+1] = array[j+1], array[j]
		temp += 1
	return array
		
		

