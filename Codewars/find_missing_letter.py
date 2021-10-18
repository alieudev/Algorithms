def find_missing_letter(chars):
    missing = ""
    first = ord(chars[0])
    for char in chars:
        if ord(char) == first: 
            first += 1 
        else: 
            return chr(ord(char)-1)


