public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  String results = "";
  for(int i=0; i<strings.length; i++){
    String key = strings[i];
    if(map.containsKey(key)){
      int val = map.get(key);
      val++;
      if(val % 2 == 0){
        results += key;
      }
      map.put(key, val);
    } else {
      map.put(key, 1);
    }
  }
  return results;
}
