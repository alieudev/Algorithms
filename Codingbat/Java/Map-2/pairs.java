public Map<String, String> pairs(String[] strings) {
  Map<String,String> map = new HashMap<String, String>();
  for(String str : strings){
    map.put( str.substring(0,1), str.substring(str.length()-1));
  }
  return map;
}

