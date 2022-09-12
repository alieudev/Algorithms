public String alarmClock(int day, boolean vacation) {
  if (vacation) {
    if(day == 0 || day == 6) return "off";
    return "10:00";
  }
  else {
    if(day == 0 || day == 6) return "10:00"; 
    return "7:00";
  }
}

