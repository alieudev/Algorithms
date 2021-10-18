def sum_of_intervals(intervals):
    intervals = sorted(intervals)
    stack = []
    for interval in intervals: 
        if len(stack) < 1: 
            stack.append(interval)
        else: 
            last_num = stack[-1]
            if last_num[1] >= interval[0]: 
                stack[-1] = [last_num[0], max(interval[1], last_num[1])]
            else: 
                stack.append(interval)
    length = 0 
    for inter in stack: 
        length += inter[1] - inter[0]
    return length
