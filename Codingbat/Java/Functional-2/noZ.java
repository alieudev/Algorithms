public List<String> noZ(List<String> strings) {
  strings = strings.stream()
    .filter( str -> !str.contains("z"))
    .collect(Collectors.toList());
    
  return strings;
}

