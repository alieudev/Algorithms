public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday && speed >65){
    if(speed <= 86){
      return 1;
    } else {
      return 2;
    }
  } else if(!isBirthday && speed > 60){
    if(speed >80) return 2;
    else {
      return 1;
    }
  }else {
    return 0;
  }
  
}

