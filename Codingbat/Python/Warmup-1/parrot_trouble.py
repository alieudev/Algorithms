def parrot_trouble(talking, hour):
  if talking: 
    return hour < 7 or hour > 20
  else: 
    return False

