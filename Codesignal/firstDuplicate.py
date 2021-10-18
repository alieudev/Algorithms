# Time: O(n) | Space: O(n)
def firstDuplicate(a):
    dupDict = {}
    for num in a: 
        dupDict[num] = dupDict.get(num, 0) + 1 
        if dupDict[num] == 2: 
            return num 
    return -1 
        


