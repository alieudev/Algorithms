def likes(names):
    if len(names) < 1: 
        return "no one likes this"
    elif len(names) == 1: 
        return f'{names[0]} likes this'
    elif len(names) == 2: 
        return f'{names[0]} and {names[1]} like this'
    elif len(names) == 3:
        output = ""
        for i in range(len(names)-2):
            output += f'{names[i]}, '
        lastTwo = f'{names[-2]} and {names[-1]} like this'
        output += lastTwo
        return output
    else: 
        num = len(names) - 2 
        output = f'{names[0]}, {names[1]} and {num} others like this'
        return output 
