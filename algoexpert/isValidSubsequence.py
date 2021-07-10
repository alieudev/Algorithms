def isValidSubsequence(array, sequence):
	if len(sequence) == 0: 
		return False
	j = 0 
	for i in range(len(array)): 
		if array[i] == sequence[j]: 
			j += 1
		if len(sequence) == j: 
			return True
	return False 
