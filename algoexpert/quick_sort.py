def quickSort(array):
    if len(array) <= 1: 
		return array 
	
	greater_items = []
	smaller_items = []
	pivot = array.pop()
	
	for item in array: 
		if item > pivot: 
			greater_items.append(item)
		else: 
			smaller_items.append(item)
	return quickSort(smaller_items) + [pivot] + quickSort(greater_items)  
	

