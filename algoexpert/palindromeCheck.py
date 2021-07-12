def isPalindrome(string):
    if len(string) == 1: 
		return True 
	
	return string == string[::-1]

