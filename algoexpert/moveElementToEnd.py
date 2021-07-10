#Time: O(n) | Space(1) #Maintained the order as well
def moveElementToEnd(array, toMove):
	k = 0 
	for idx, element in enumerate(array): 
		if element != toMove: 
			swap(array, idx, k)
			k += 1
	return array
	
def swap(array, idx, k): 
	array[idx], array[k] = array[k], array[idx]
