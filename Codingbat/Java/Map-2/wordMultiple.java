public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<String, Boolean>();
  for(String str : strings){
    if(count(str, strings) >= 2){
      map.put(str, true);
    } else {
      map.put(str, false);
    }
  }
  return map;
}

public int count(String c, String[] arr){
  int count = 0;
  for(String cha : arr){
    if(cha.equals(c)){
      count++;
    }
  }
  return count;
}

