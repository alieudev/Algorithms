def tournamentWinner(competitions, results):
	winningTeams = []
	for idx, row in enumerate(competitions): 
		if results[idx] == 0:
			winningTeams.append(row[1])
		else: 
			winningTeams.append(row[0])
	return max(set(winningTeams), key=winningTeams.count)
