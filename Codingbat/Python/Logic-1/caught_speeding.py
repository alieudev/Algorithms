def caught_speeding(speed, is_birthday):
  if is_birthday: 
    if speed > 85: 
      return 2 
    elif speed > 65 and speed <= 85 : 
      return 1 
    else: 
      return 0
  elif not is_birthday: 
    if speed > 80: 
      return 2 
    if speed > 60 and speed <= 80: 
      return 1 
    else: 
      return 0 
