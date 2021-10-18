def firstNotRepeatingCharacter(s):
    counter = {}
    
    for char in s: 
        counter[char] = counter.get(char, 0) + 1 
    
    for key in counter: 
        if counter[key] == 1: 
            return key
    return '_'
    


