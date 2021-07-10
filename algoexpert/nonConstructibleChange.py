def nonConstructibleChange(coins):
    change_we_can_make = 0 
	sortedCoins = sorted(coins)
	
	for coin in sortedCoins:
		if change_we_can_make + 1 < coin: 
			return change_we_can_make + 1
		else: 
			change_we_can_make += coin
	return change_we_can_make + 1
