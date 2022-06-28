public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for(int i=0; i<strings.length; i++){
    String key = String.valueOf(strings[i].charAt(0));
    
    if(map.containsKey(key)){
      map.put(key, map.get(key)+strings[i]);
    } else {
      map.put(key, strings[i]);
    }
  }
  return map;
}

