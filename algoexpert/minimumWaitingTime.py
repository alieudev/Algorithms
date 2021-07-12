def minimumWaitingTime(queries):
	queries.sort()
    minWaitingTime = 0 
	
	for idx, duration in enumerate(queries):
		queriesLeft = len(queries) - (idx + 1)
		minWaitingTime += duration * queriesLeft
	
	return minWaitingTime
