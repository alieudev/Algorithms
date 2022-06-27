public Map<String, String> mapAB4(Map<String, String> map) {
  if(map.containsKey("a") && 
    map.containsKey("b") && 
    map.get("a").length() > map.get("b").length()){
    map.put("c", map.get("a"));
    return map;
  } 
  else if(map.containsKey("a") && 
    map.containsKey("b") && 
    map.get("a").length() < map.get("b").length()){
    map.put("c", map.get("b"));
    return map;
  } else if (map.containsKey("a") && 
    map.containsKey("b") && 
    map.get("a").length() == map.get("b").length()){
    map.put("a", "");
    map.put("b", "");
    return map;
  }
  return map;
  
}

