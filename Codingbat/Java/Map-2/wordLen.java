public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(String str : strings){
    map.put(str, str.length());
  }
  return map;
}

