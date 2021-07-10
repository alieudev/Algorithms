#Brute Force, O(n^2) time | O(1) space 
def twoNumberSum(array, targetSum):
	for i in range(len(array)-1): 
		for j in range(i, len(array)): 
			if array[j] != array[i] and array[j] + array[i] == targetSum: 
				return [array[i], array[j]]
	return []



# O(n) time | O(n) space 
def twoNumberSum(array, targetSum):
	nums = {}
	for num in array: 
		potentialMatch = targerSum - num 
		if potentialMatch in nums: 
			return [potentialMatch, num]
		else: 
			nums[num] = True
			
	return []


# O(nlog(n)) | O(1) space 

def twoNumberSUm(array, targetSum): 
	array.sort()
	left = 0 
	right = len(array) - 1 
	
	while left < right: 
		currentSum = array[left] + array[right]
		if currentSum == targetSum: 
			return [array[left], array[right]]
		elif currentSum < targetSum: 
			left += 1 
		elif currentSum > targetSum: 
			right -= 1
	return []
